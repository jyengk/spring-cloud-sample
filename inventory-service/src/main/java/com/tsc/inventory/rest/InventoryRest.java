package com.tsc.inventory.rest;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsc.inventory.model.InventoryModel;
import com.tsc.inventory.service.InventoryService;

@RestController
@ControllerAdvice
@RequestMapping("/inventories")
public class InventoryRest {
	
	@Autowired
	InventoryService inventoryService;
	
	@RequestMapping("/find-by-productids")
	public Collection<InventoryModel> findByInventories(@RequestParam(value="product-id") List<Long> productIds){
		return inventoryService.getInventoryDetails(productIds);
	}
	
	
	
}
