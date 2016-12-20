package com.tsc.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsc.order.model.OrderModel;
import com.tsc.order.repository.DataRepository;

/**
 * Service to fetch or persist all order related details.
 * @author jyengk
 *
 */
@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	DataRepository dataRepository;

	@Override
	public List<OrderModel> createOrUpdateOrders(List<OrderModel> models) {
		//Any data massaging will be done here
		return dataRepository.createOrUpdate(models);
	}

	@Override
	public List<OrderModel> getByOrderId(String orderId) {
		return dataRepository.getByOrderId(orderId);
	}

	@Override
	public OrderModel getBySubOrderId(String subOrderId) {
		return dataRepository.getBySubOrderId(subOrderId);
	}

}
