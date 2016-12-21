package com.tsc.order.client.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tsc.order.client.model.OrderModel;
import com.tsc.order.client.model.OrderPaymentModel;

@Service
public class OrderPaymentServiceImpl extends FallbackService implements OrderService{
	
	static final OrderModelAssembler asemlber = new OrderModelAssembler();
	
	@Autowired
	RestTemplate restTemplate;
	
	//@Value("${order.service.id}")
	private String url = "http://order-service/orders" ;
	
	@HystrixCommand(fallbackMethod = "createOrdersFallBack")
	@Override
	public List<OrderModel> createOrders(List<OrderPaymentModel> orderPaymentModels) {
		//Form url with the URL mapping - "http://order-service/orders" 
		//url = url + "/orders";
		System.out.println(">>>>> URL : " + url);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Object> requestEntity = new HttpEntity	<Object>(orderPaymentModels.stream().map(a -> asemlber.assembleOrderModel(a)).collect(Collectors.toList()),headers);
		restTemplate.exchange(url, HttpMethod.POST, requestEntity, OrderModel[].class);
		ResponseEntity<List<OrderModel>> rateResponse 
		= restTemplate.exchange(url, HttpMethod.POST, requestEntity,new ParameterizedTypeReference<List<OrderModel>>() {});
		return rateResponse.getBody();
	}
	
}

//Assembler class to be moved to a package outside
class OrderModelAssembler{
	OrderModel assembleOrderModel(OrderPaymentModel orderPaymentModel){
		OrderModel model = new OrderModel();
		model.setProductId(orderPaymentModel.getProductId());
		model.setProductName(orderPaymentModel.getProductName());
		return model;
	}
}
