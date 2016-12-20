package com.tsc.order.client.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tsc.order.client.model.OrderPaymentModel;

@Service
public class OrderPaymentModelImpl implements OrderService{
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${order.placement.service}")
	private String url;

	@Override
	public Collection<OrderPaymentModel> createOrders(Collection<OrderPaymentModel> orderPaymentModel) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		restTemplate.exchange(url, HttpMethod.POST, requestEntity, OrderPaymentModel[].class);
		HttpEntity<Object> requestEntity = new HttpEntity<Object>(personList,headers);
		
		
		/*ResponseEntity<Object[]> responseEntity = restTemplate.getForEntity(urlGETList, Object[].class);
		Object[] objects = responseEntity.getBody();
		MediaType contentType = responseEntity.getHeaders().getContentType();
		HttpStatus statusCode = responseEntity.getStatusCode();*/
		
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		//person list
		List<Person> personList = new ArrayList<Person>();
		Person person = new Person();
		person.setName("UserOne");  
		personList.add(person);
		//httpEnitity       
		HttpEntity<Object> requestEntity = new HttpEntity<Object>(personList,headers);
		ResponseEntity<List<Person>> rateResponse 
				= restTemplate.exchange(url, HttpMethod.POST, requestEntity,new ParameterizedTypeReference<List<Person>>() {});
	}

}
