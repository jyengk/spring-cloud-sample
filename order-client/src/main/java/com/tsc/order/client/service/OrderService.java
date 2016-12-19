package com.tsc.order.client.service;

import org.springframework.stereotype.Service;

import com.tsc.order.client.model.MasterOrderModel;

@Service
public interface OrderService {
	void createOrders(MasterOrderModel masterOrderModel);
}
