package com.tsc.order.client.model;

public class OrderInventoryModel {
	
	public String orderId;
	public String subOrderId;
	public String itemCount;
	public Long productId;
	public boolean isAvailable;
	
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

	public String getItemCount() {
		return itemCount;
	}

	public void setItemCount(String itemCount) {
		this.itemCount = itemCount;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "InventoryModel [orderId=" + orderId + ", subOrderId=" + subOrderId + ", itemCount=" + itemCount
				+ ", productId=" + productId + "]";
	}
	
	

}
