package com.tsc.order.repository;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

import com.tsc.order.model.OrderModel;

@Component
public class DataRespositoryImpl implements DataRepository{
	// key - subOrderId and value - List<OrderModel> 
	private Map<String, List<OrderModel>> orders = new ConcurrentHashMap<>();
	
	@Override
	public List<OrderModel> createOrUpdate(List<OrderModel> orderList){
		String orderId = UUID.randomUUID().toString();
		orderList.stream().forEach(a -> {a.setOrderId(orderId); 
										a.setSubOrderId(UUID.randomUUID().toString());});
		orders.put(orderId, orderList);
		System.out.println(Arrays.toString(orderList.toArray()));
		return orderList;
	}
	
	@Override
	public List<OrderModel> getByOrderId(String orderId){
		System.out.println("order id for which the order details are being fetched : "+ orderId);
		return orders.get(orderId);
	}
	
	@Override
	public OrderModel getBySubOrderId(String subOrderId){
		Optional<OrderModel> orderModel = null;
		for(Map.Entry<String, List<OrderModel>> order : orders.entrySet()){
			orderModel = order.getValue().stream().filter(a -> a.getSubOrderId().equals(subOrderId)).findFirst();
		}
		return orderModel.get();
	}

}
