package com.tsc.inventory.service;

import java.util.Collection;

import com.tsc.inventory.model.InventoryModel;

public interface InventoryService {
	
	public Collection<InventoryModel> getInventoryDetails(Collection<Long> productIds);

}
