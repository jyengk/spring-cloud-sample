package com.tsc.inventory.model;

import java.util.Collection;

import org.springframework.stereotype.Component;

/**
 * Model object containing inventory details
 * @author Jen
 *
 */
@Component
public class InventoryModel {
	
	private long id;
	private long productId;
	private long stock;
	private Collection<StoreDetailsModel> pickupStores;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getStock() {
		return stock;
	}
	public void setStock(long stock) {
		this.stock = stock;
	}
	public Collection<StoreDetailsModel> getPickupStores() {
		return pickupStores;
	}
	public void setPickupStores(Collection<StoreDetailsModel> pickupStores) {
		this.pickupStores = pickupStores;
	}
	@Override
	public String toString() {
		return "InventoryModel [id=" + id + ", productId=" + productId + ", stock=" + stock + ", pickupStores="
				+ pickupStores + "]";
	}
	
}
