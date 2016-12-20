package com.tsc.order.client.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tsc.order.client.model.OrderModel;
import com.tsc.order.client.model.OrderPaymentModel;
import com.tsc.order.client.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderPlacementAPiGatewayRestController {
	
	@Autowired
	OrderService orderService;
	
	@RequestMapping(method = RequestMethod.POST)
	public List<OrderModel> createOrUpdateOrders(@RequestBody List<OrderPaymentModel> models){
		System.out.println("Inside the rest controller");
		return orderService.createOrders(models);
	}
	
}
