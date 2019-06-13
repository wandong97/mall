package com.wandong.domin;

/**
 * 购物像实体
 * 
 * @author wandong 2019年4月25日下午2:52:56 TODO:
 */
public class CartItem {
	private Product product;
	private Integer count;// product数量
	private double subTotal;// product小记

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public double getSubTotal() {
		return product.getShop_price() * count;
	}
	// public void setSubTotal(double subTotal) {
	// this.subTotal = subTotal;
	// }

}
