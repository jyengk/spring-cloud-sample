package com.tsc.order.client.service;

import java.util.ArrayList;
import java.util.List;

import com.tsc.order.client.model.OrderModel;
import com.tsc.order.client.model.OrderPaymentModel;

/**
 * Base service exposing fallback methods.
 * TODO - Add logggers
 * @author jyengk
 *
 */
public class FallbackService {
	
	/**
	 * Handle exceptions if required by passing throwable in param
	 * @return
	 */
	public List<OrderModel> createOrdersFallBack(List<OrderPaymentModel> orderPaymentModels){
		List<OrderModel> emptyModel = new ArrayList<>();
		return emptyModel;
	}

}
