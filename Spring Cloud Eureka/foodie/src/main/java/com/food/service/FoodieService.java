package com.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.food.data.FoodMenuModel;
import com.food.data.FoodieData;


@Service
public class FoodieService {

	
@Autowired
RestTemplate restTemplate;
 
FoodieData data = new FoodieData();
	public FoodieData getMenu() {
		FoodMenuModel foodMenu = restTemplate.getForObject("http://food-menu-data-service/food/menu", FoodMenuModel.class);
		
		if (foodMenu.getFoodMenu() != null) {
	 data.setFoodMenu(foodMenu.getFoodMenu());
	 data.setResponseCode(00);
	 data.setResponseMessage("Available Food Menu");
		}else{
			data.setFoodMenu(null);
			 data.setResponseCode(-1001);
			 data.setResponseMessage("No Food Menu is available at the moment");	
			
		}
		return data;
	}
	
}
