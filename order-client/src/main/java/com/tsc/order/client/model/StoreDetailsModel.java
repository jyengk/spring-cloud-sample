package com.tsc.order.client.model;

public class StoreDetailsModel {
	
	public String storeName;
	public String storeAddress;
	public String availablePickUpTime;
	public int availableStock;
	
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreAddress() {
		return storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	public String getAvailablePickUpTime() {
		return availablePickUpTime;
	}
	public void setAvailablePickUpTime(String availablePickUpTime) {
		this.availablePickUpTime = availablePickUpTime;
	}
	public int getAvailableStock() {
		return availableStock;
	}
	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}
	@Override
	public String toString() {
		return "StoreDetailsModel [storeName=" + storeName + ", storeAddress=" + storeAddress + ", availablePickUpTime="
				+ availablePickUpTime + ", availableStock=" + availableStock + "]";
	}
}
