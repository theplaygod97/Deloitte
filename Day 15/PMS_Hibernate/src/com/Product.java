package com;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {


	private int productId;
	private String productName;
	private int price;
	private int qoh;
	
	public Product(int productId, String productName, int price, int qoh) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.qoh = qoh;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", qoh=" + qoh
				+ "]\n";
	}
	public int getQoh() {
		return qoh;
	}
	public void setQoh(int qoh) {
		this.qoh = qoh;
	}
	public Product() {
		super();
	}

	public void acceptProductDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product id : ");
		productId = scanner.nextInt();
		System.out.println("Enter product name : ");
		productName = scanner.next();
		System.out.println("Enter product price : ");
		price = scanner.nextInt();
		System.out.println("Enter product qoh : ");
		qoh = scanner.nextInt();
	}

	



}