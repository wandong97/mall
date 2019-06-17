package com.wandong.conteroller;

import com.wandong.domin.User;
import com.wandong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView login(@RequestParam(required = true) String username, @RequestParam(required = true) String password, HttpServletRequest request, @RequestParam(required = true) String cheakimage) {
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        String checkcode_session = (String) session.getAttribute("checkcode_session");
        if (checkcode_session.equals(cheakimage)) {
            User user = userService.find(username, password);

            if (user == null) {
                mv.addObject("msg", "》》》》》》》》》用户名或密码错误》》》》》》");
                mv.setViewName("msg");
            } else {
                session.setAttribute("user", user);
                mv.setViewName("index");
            }
        } else {
            mv.addObject("msg", "验证码错误");
            mv.setViewName("msg");
        }
        return mv;
    }

    @RequestMapping("/quit")
    public void quit(HttpSession session, HttpServletResponse response) {
        session.removeAttribute("user");
        try {
            response.sendRedirect("/jsp/index.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/register")
    public ModelAndView register(User user) {
        String code = UUID.randomUUID().toString();
        user.setUid(code);
        user.setState(0);
        ModelAndView mv = new ModelAndView();
        //MailUtils.sendMail(user.getEmail(), "密钥", user.getName() + ",您好，你的密钥是" + code + "请妥善保存");
        //System.out.println("email sent success.. ");
        userService.save(user);
        mv.setViewName("msg");
        return mv;
    }
}
