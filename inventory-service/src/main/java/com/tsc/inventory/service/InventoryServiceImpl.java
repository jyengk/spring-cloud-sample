package com.tsc.inventory.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tsc.inventory.model.InventoryModel;

@Service
public class InventoryServiceImpl implements InventoryService{
	
	@Value("${inventory.wms.url}")
	private String wmsUrl;
	
	//Rest template to call the WMS APIs
	@Autowired
	RestTemplate restTemplate;
	
	/**
	 * Fetch and assemble the inventory details from an external WMS system.
	 * @param Collection<Long> productIds
	 * @return Collection<InventoryModel>
	 */
	@Override
	public Collection<InventoryModel> getInventoryDetails(Collection<Long> productIds) {
		//restTemplate.exchange should return you a list of inventorydetails which needs to be looped 
		// and assembled as per the inventory-service requirement.
		List<InventoryModel> inventoryModels = new ArrayList<InventoryModel>();
		return inventoryModels;
	}
	

}
