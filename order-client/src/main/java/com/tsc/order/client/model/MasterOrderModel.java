package com.tsc.order.client.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MasterOrderModel {
	
	private String pmtType;//Change to Enum - COD, CREDITCARD, Wallet, Rewards
	private String totalAmount;
	private Boolean amountReceived;
	private List<OrderModel> orders;
	
	public String getPmtType() {
		return pmtType;
	}
	public void setPmtType(String pmtType) {
		this.pmtType = pmtType;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Boolean getAmountReceived() {
		return amountReceived;
	}
	public void setAmountReceived(Boolean amountReceived) {
		this.amountReceived = amountReceived;
	}
	public List<OrderModel> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderModel> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "MasterOrderModel [pmtType=" + pmtType + ", totalAmount=" + totalAmount + ", amountReceived="
				+ amountReceived + ", orders=" + orders + "]";
	}
	
}
