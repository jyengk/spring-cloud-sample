package com.tsc.order.client.service;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tsc.order.client.model.OrderModel;
import com.tsc.order.client.model.OrderPaymentModel;

/**
 * Order service for creating orders
 * @author jyengk
 *
 */
@Service
public interface OrderService {
	List<OrderModel> createOrders(List<OrderPaymentModel> orderPaymentModels);
}
