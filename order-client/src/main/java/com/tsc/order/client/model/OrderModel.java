package com.tsc.order.client.model;

public class OrderModel {
	
	private String subOrderId;
	private String orderId;
	private Long productId;
	private String productName;
	private Integer quantity;
	private boolean pickUpAtStore;
	private String storeForPickUp;
	private String retailer;
	private Double price;
	private boolean isDelivered;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getSubOrderId() {
		return subOrderId;
	}
	public void setSubOrderId(String subOrderId) {
		this.subOrderId = subOrderId;
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
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
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
	public boolean isDelivered() {
		return isDelivered;
	}
	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
	@Override
	public String toString() {
		return "OrderModel [orderId=" + orderId + ", subOrderId=" + subOrderId + ", productId=" + productId
				+ ", productName=" + productName + ", quantity=" + quantity + ", pickUpAtStore=" + pickUpAtStore
				+ ", storeForPickUp=" + storeForPickUp + ", retailer=" + retailer + ", price=" + price
				+ ", isDelivered=" + isDelivered + "]";
	}
	
}
