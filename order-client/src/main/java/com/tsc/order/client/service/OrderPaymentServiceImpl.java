package com.tsc.order.client.service;

import java.util.Collection;
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

import com.tsc.order.client.model.OrderModel;
import com.tsc.order.client.model.OrderPaymentModel;

@Service
public class OrderPaymentServiceImpl implements OrderService{
	
	static final OrderModelAssembler asemlber = new OrderModelAssembler();
	
	@Autowired
	RestTemplate restTemplate;
	
	//@Value("${order.service.id}")
	private String url ="http://order-service/orders";

	@Override
	public List<OrderModel> createOrders(List<OrderPaymentModel> orderPaymentModels) {
		System.out.println(">>>>> URL : " + url);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Object> requestEntity = new HttpEntity	<Object>(orderPaymentModels.stream().map(a -> asemlber.assembleOrderModel(a)).collect(Collectors.toList()),headers);
		restTemplate.exchange(url, HttpMethod.POST, requestEntity, OrderModel[].class);
		ResponseEntity<List<OrderModel>> rateResponse 
		= restTemplate.exchange(url, HttpMethod.POST, requestEntity,new ParameterizedTypeReference<List<OrderModel>>() {});
		return rateResponse.getBody();
		
		
		
		/*ResponseEntity<Object[]> responseEntity = restTemplate.getForEntity(urlGETList, Object[].class);
		Object[] objects = responseEntity.getBody();
		MediaType contentType = responseEntity.getHeaders().getContentType();
		HttpStatus statusCode = responseEntity.getStatusCode();*/
		
		
		/*headers.setContentType(MediaType.APPLICATION_JSON);
		//person list
		List<Person> personList = new ArrayList<Person>();
		Person person = new Person();
		person.setName("UserOne");  
		personList.add(person);
		//httpEnitity       
		HttpEntity<Object> requestEntity = new HttpEntity<Object>(personList,headers);
		ResponseEntity<List<Person>> rateResponse 
				= restTemplate.exchange(url, HttpMethod.POST, requestEntity,new ParameterizedTypeReference<List<Person>>() {});*/
	}
	
}

class OrderModelAssembler{
	OrderModel assembleOrderModel(OrderPaymentModel orderPaymentModel){
		OrderModel model = new OrderModel();
		model.setProductId(orderPaymentModel.getProductId());
		model.setProductName(orderPaymentModel.getProductName());
		return model;
	}
}
