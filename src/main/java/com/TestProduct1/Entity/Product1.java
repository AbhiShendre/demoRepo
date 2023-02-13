package com.TestProduct1.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product1 {
	@Id
	private long productId;
	private long categoryId;
	private String productName;
	private double productPrice;
	private int longproductQty;
	private long supplierId;

	public Product1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product1(long productId, long categoryId, String productName, double productPrice, int longproductQty,
			long supplierId) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.longproductQty = longproductQty;
		this.supplierId = supplierId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getLongproductQty() {
		return longproductQty;
	}

	public void setLongproductQty(int longproductQty) {
		this.longproductQty = longproductQty;
	}

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	@Override
	public String toString() {
		return "Product1 [productId=" + productId + ", categoryId=" + categoryId + ", productName=" + productName
				+ ", productPrice=" + productPrice + ", longproductQty=" + longproductQty + ", supplierId=" + supplierId
				+ "]";
	}

}
