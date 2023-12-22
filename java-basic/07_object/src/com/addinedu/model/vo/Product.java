package com.addinedu.model.vo;

public class Product {
	
	private String productld;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	
	public String getProductld() {
		return productld;
	}
	public void setProductld(String productld) {
		this.productld = productld;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductArea() {
		return productArea;
	}
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}

}
