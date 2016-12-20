package com.tsc.order.repository;

import java.util.List;

import com.tsc.order.model.OrderModel;

public interface DataRepository {
	
	public List<OrderModel> createOrUpdate(List<OrderModel> orderList);
	public List<OrderModel> getByOrderId(String orderId);
	public OrderModel getBySubOrderId(String subOrderId);

}
