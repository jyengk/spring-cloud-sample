package com.tsc.order.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tsc.order.model.OrderModel;
import com.tsc.order.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderRest {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(method = RequestMethod.POST)
	public List<OrderModel> createOrUpdateOrders(@RequestBody List<OrderModel> models){
		return orderService.createOrUpdateOrders(models);
	}
	
	@RequestMapping(value= "/order-id/{orderId}", method = RequestMethod.GET)
	public List<OrderModel> getByOrderId(@PathVariable("orderId") String orderId){
		return orderService.getByOrderId(orderId);
	}
	
	@RequestMapping(value="/sub-order-id/{subOrderId}", method = RequestMethod.GET)
	public OrderModel getBySubOrderId(@PathVariable("subOrderId")String subOrderId) {
		return orderService.getBySubOrderId(subOrderId);
	}

}
