package com.food.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.food.data.FoodMenuModel;
import com.food.data.MenuData;
import com.food.service.FoodMenuService;

@RestController
@RequestMapping("/food")
public class FoodMenuController {

	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	FoodMenuService foodmenusvc;

	/*
	 * @Autowired private WebClient.Builder webClientBuilder;
	 */

		@PostMapping("/menu")
	public FoodMenuModel addMenuForVendor(@RequestBody MenuData foodMenuData ){
			FoodMenuModel foodmenuModel = new FoodMenuModel();
			foodmenuModel = foodmenusvc.addMenu(foodMenuData);
			
			return foodmenuModel;		
}
		
		
		@GetMapping("/menu")
		public FoodMenuModel fetchAllMenu() {
			FoodMenuModel foodmenuModel = new FoodMenuModel();
			foodmenuModel = foodmenusvc.getAllMenu();
			
			if(foodmenuModel.getFoodMenu() == null) {
			 foodmenuModel.setFoodMenu(null);
				
			}else {
				return foodmenuModel;	
			}
			return foodmenuModel;
		}
		
			
		
}
