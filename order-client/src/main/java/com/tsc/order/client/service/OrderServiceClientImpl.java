package com.tsc.order.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tsc.order.client.model.MasterOrderModel;

@Service
public class OrderServiceClientImpl implements OrderService{
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public void createOrders(MasterOrderModel model) {
		//this.restTemplate.pos
	}

}
