package com.tsc.order.client.service;

import java.util.List;

import com.tsc.order.client.model.InventoryModel;
import com.tsc.order.client.model.OrderInventoryModel;
import com.tsc.order.client.model.OrderPaymentModel;

public interface InventoryService {
	
	//Fetch the availability of the items from the warehouse
	public List<OrderInventoryModel> updateInventoryService(List<OrderPaymentModel> models);
	
	//Fetch inventory details
	public List<InventoryModel> getInventoryDetails(List<Long> productIds);

}
