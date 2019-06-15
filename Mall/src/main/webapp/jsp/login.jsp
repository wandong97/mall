<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>l
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>会员登录</title>

    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/detailsmusic.css"/>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/bootstrap.min.css"
          type="text/css"/>
    <script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"
            type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"
            type="text/javascript"></script>
    <!-- 引入自定义css文件 style.css -->
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css" type="text/css"/>

    <style>
        body {
            margin-top: 20px;
            margin: 0 auto;
        }

        .carousel-inner .item img {
            width: 100%;
            height: 300px;
        }

        .container .row div {
            /* position:relative;
             float:left; */

        }

        font {
            color: #666;
            font-size: 22px;
            font-weight: normal;
            padding-right: 17px;
        }
    </style>
</head>
<body>


<!--
            时间：2015-12-30
            描述：菜单栏
        -->
<div class="container-fluid">
    <%@include file="/jsp/head.jsp" %>


    <div class="container"
         style="width:100%;height:460px;background:#FF2C4C url('${pageContext.request.contextPath}/images/loginbg.jpg') no-repeat;">
        <div class="row">
            <div class="music-lgin">

                <div class="music-lgin-all">
                    <!--左手-->
                    <div class="music-lgin-left ovhd">
                        <div class="music-hand">
                            <div class="music-lgin-hara"></div>
                            <div class="music-lgin-hars"></div>
                        </div>
                    </div>

                    <!--脑袋-->
                    <div class="music-lgin-dh">
                        <div class="music-lgin-alls">
                            <div class="music-lgin-eyeleft">
                                <div class="music-left-eyeball yeball-l"></div>
                            </div>
                            <div class="music-lgin-eyeright">
                                <div class="music-right-eyeball yeball-r"></div>
                            </div>
                            <div class="music-lgin-cl"></div>
                        </div>
                        <!--鼻子-->
                        <div class="music-nose"></div>
                        <!--嘴-->
                        <div class="music-mouth music-mouth-ds"></div>
                        <!--肩-->
                        <div class="music-shoulder-l">
                            <div class="music-shoulder"></div>
                        </div>
                        <div class="music-shoulder-r">
                            <div class="music-shoulder"></div>
                        </div>
                        <!--消息框-->
                        <div class="music-news"></div>
                    </div>

                    <!--右手-->
                    <div class="music-lgin-right ovhd">
                        <div class="music-hand">
                            <div class="music-lgin-hara"></div>
                            <div class="music-lgin-hars"></div>
                        </div>
                    </div>

                </div>

                <!--1-->
                <form action="${pageContext.request.contextPath}/user/login" method="post">
                <div class="music-lgin-text">
                    <input class="inputname inputs" type="text" placeholder="用户名" id="username" name="username"/>
                </div>
                <!--2-->
                <div class="music-lgin-text">
                    <input type="password" class="mima inputs" placeholder="密码" id="password" name="password"/>
                </div>
                    <div class="music-lgin-text">
                        <input type="text" class="mima inputs" placeholder="验证码" id="cheakimage" name="cheakimage"/>
                    </div>
                    <div class="col-sm-3">
                        <img style="margin-top: -25px" src="${pageContext.request.contextPath}/checkImageServlet" />
                    </div>
                <!--3-->
                <div class="music-lgin-text">
                    <input class="music-qd inputs" type="submit" value="确定"/>
                </div>
                </form>
            </div>

            <script src="js/jquery-1.9.1.min.js"></script>
            <script type="text/javascript">
                //眼睛 密码部分
                $(".mima").focus(function () {
                    $(".music-lgin-left").addClass("left-dh").removeClass("rmleft-dh");
                    $(".music-lgin-right").addClass("right-dh").removeClass("right-rmdh");
                    $(".music-hand").addClass("no");
                }).blur(function () {
                    $(".music-lgin-left").removeClass("left-dh").addClass("rmleft-dh");
                    $(".music-lgin-right").removeClass("right-dh").addClass("right-rmdh");
                    $(".music-hand").removeClass("no");

                })
                //点击小人出来
                $(".inputname").focus(function () {
                    $(".music-lgin-all").addClass("block");
                    $(".music-news").addClass("no")
                })
                //点击小人消失

                //          $(".music-qd").focus(function(){
                //          	$(".music-lgin-all").removeClass("block")
                //          })


                //注册正则 简单判断

                $('.music-qd').click(function () {
                    if (($('.inputname').val() == '')) {
                        $(".music-news").html("请输入名称")
                    }
                    else if (($('.cheakimage').val() == '')){
                        $(".music-news").html("请输入验证码")

                    }else if (($('.mima').val() == '')) {
                        $(".music-news").html("请输入密码")
                        $(".music-news").addClass("block")
                    } else {
                    }
                })

            </script>
        </div>
    </div>

    <div style="margin-top:50px;">
        <img src="${pageContext.request.contextPath}/image/footer.jpg"
             width="100%" height="78" alt="我们的优势" title="我们的优势"/>
    </div>

    <div style="text-align: center;margin-top: 5px;">
        <ul class="list-inline">
            <li><a>关于我们</a></li>
            <li><a>联系我们</a></li>
            <li><a>招贤纳士</a></li>
            <li><a>法律声明</a></li>
            <li><a>友情链接</a></li>
            <li><a target="_blank">支付方式</a></li>
            <li><a target="_blank">配送方式</a></li>
            <li><a>服务声明</a></li>
            <li><a>广告声明</a></li>
        </ul>
    </div>
    <div style="text-align: center;margin-top: 5px;margin-bottom:20px;">
        Copyright &copy;2019-2020 XXX商城 版权所有
    </div>
</body>
</html>