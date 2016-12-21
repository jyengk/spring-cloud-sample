package com.tsc.order.client.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tsc.order.client.model.InventoryModel;
import com.tsc.order.client.model.OrderInventoryModel;
import com.tsc.order.client.model.OrderPaymentModel;

@Component
public class InventoryServiceImpl implements InventoryService{

	@Override
	public List<InventoryModel> getInventoryDetails(List<Long> productIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderInventoryModel> updateInventoryService(List<OrderPaymentModel> models) {
		// TODO Auto-generated method stub
		return null;
	}

}
