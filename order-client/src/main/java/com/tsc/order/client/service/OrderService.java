package com.tsc.order.client.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.tsc.order.client.model.OrderPaymentModel;


@Service
public interface OrderService {
	Collection<OrderPaymentModel> createOrders(Collection<OrderPaymentModel> orderPaymentModels);
}
