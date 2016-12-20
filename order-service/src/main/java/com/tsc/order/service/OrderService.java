package com.tsc.order.service;

import java.util.List;

import com.tsc.order.model.OrderModel;

/**
 * OrderService for creating, updating requests 
 * @author jyengk
 *
 */
public interface OrderService {
	
	List<OrderModel> createOrUpdateOrders(List<OrderModel> models);
	List<OrderModel> getByOrderId(String orderId);
	OrderModel getBySubOrderId(String subOrderId);

}
