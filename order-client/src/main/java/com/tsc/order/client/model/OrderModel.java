package com.tsc.order.client.model;

import org.springframework.stereotype.Component;

@Component
public class OrderModel{
	
	private String orderId;
	private Long productId;
	private String productName;
	private int quantity;
	private boolean pickUpAtStore;
	private String storeForPickUp;
	private String retailer;
	private Double price;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isPickUpAtStore() {
		return pickUpAtStore;
	}
	public void setPickUpAtStore(boolean pickUpAtStore) {
		this.pickUpAtStore = pickUpAtStore;
	}
	public String getStoreForPickUp() {
		return storeForPickUp;
	}
	public void setStoreForPickUp(String storeForPickUp) {
		this.storeForPickUp = storeForPickUp;
	}
	public String getRetailer() {
		return retailer;
	}
	public void setRetailer(String retailer) {
		this.retailer = retailer;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderModel [orderId=" + orderId + ", productId=" + productId + ", productName=" + productName
				+ ", quantity=" + quantity + ", pickUpAtStore=" + pickUpAtStore + ", storeForPickUp=" + storeForPickUp
				+ ", retailer=" + retailer + ", price=" + price + "]";
	}
}
