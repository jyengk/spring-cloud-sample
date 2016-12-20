package com.tsc.order.client.model;

import org.springframework.stereotype.Component;

@Component
public class OrderPaymentModel{
	
	private String orderId;
	private String subOrderId;
	private Long productId;
	private String productName;
	private Integer quantity;
	private boolean pickUpAtStore;
	private String storeForPickUp;
	private String retailer;
	private Double price;
	private boolean isDelivered;
	//Payment related details for the order sent from front end.
	private Double totalOrderAmount;
	private boolean isPmtPending;
	private String paymentMode;

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
	public String getSubOrderId() {
		return subOrderId;
	}
	public void setSubOrderId(String subOrderId) {
		this.subOrderId = subOrderId;
	}
	public boolean isDelivered() {
		return isDelivered;
	}
	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public boolean isPmtPending() {
		return isPmtPending;
	}
	public void setPmtPending(boolean isPmtPending) {
		this.isPmtPending = isPmtPending;
	}
	public Double getTotalOrderAmount() {
		return totalOrderAmount;
	}
	public void setTotalOrderAmount(Double totalOrderAmount) {
		this.totalOrderAmount = totalOrderAmount;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "OrderPaymentModel [orderId=" + orderId + ", subOrderId=" + subOrderId + ", productId=" + productId
				+ ", productName=" + productName + ", quantity=" + quantity + ", pickUpAtStore=" + pickUpAtStore
				+ ", storeForPickUp=" + storeForPickUp + ", retailer=" + retailer + ", price=" + price
				+ ", isDelivered=" + isDelivered + ", totalOrderAmount=" + totalOrderAmount + ", isPmtPending="
				+ isPmtPending + ", paymentMode=" + paymentMode + "]";
	}
}
