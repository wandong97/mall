package com.wandong.domin;

import java.util.LinkedHashMap;
import java.util.Map;
/**
 * 
 * @author wandong
 * 2019年4月25日下午3:56:18
 * TODO:购物车实体
 */
public class Cart {
	private Map<String, CartItem> map = new LinkedHashMap<String, CartItem>();//购物项
	private double total;//总价格

	public Map<String, CartItem> getMap() {
		return map;
	}

	public void setMap(Map<String, CartItem> map) {
		this.map = map;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * 清空购物车
	 */
	public void clear() {
		total = 0;
		map.clear();
	}

	/**
	 * 删除购物项
	 * @param key
	 */
	public void del(String key) {
		CartItem item = map.remove(key);
		total = total - item.getSubTotal();
	}
	/**
	 * 添加购物项
	 * @param cartItem
	 */
	public void add(CartItem cartItem){
		CartItem item1 = map.get(cartItem.getProduct().getPid());
		if(item1==null){
			map.put(cartItem.getProduct().getPid(), cartItem);
			total+=cartItem.getSubTotal();
		}else{
			item1.setCount(cartItem.getCount()+item1.getCount());
			total+=cartItem.getSubTotal();
		}
	}

}
