package com.food.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.food.data.FoodMenuModel;
import com.food.data.MenuData;
import com.food.data.Vendor;

@Service
public class FoodMenuService {

	@Autowired
	RestTemplate restTemplate;
	
	FoodMenuModel foodmenuModel = new FoodMenuModel();
	
	private long initVal= 0;
	
	
	
	public FoodMenuModel addMenu(MenuData foodMenuData) {
		ArrayList<MenuData> foodArray = new ArrayList<MenuData>();
	
		//foodArray.clear();
	Long userId = foodMenuData.getId();  
		Vendor vendor = restTemplate.getForObject("http://food-vendor-data-service/food/vendor/" + userId, Vendor.class);
		

 if (vendor.getId() != initVal) {
	 foodArray.clear(); 
 }
		if(vendor.getFullname() != null) {
			foodmenuModel.setFullname(vendor.getFullname());
			foodmenuModel.setId(vendor.getId());
			foodArray.add(foodMenuData);
			foodmenuModel.setFoodMenu(foodArray);
			 initVal = vendor.getId();
		}
		//
		return foodmenuModel;
	
	}

	public FoodMenuModel getAllMenu() {	
		return foodmenuModel;
	}

	

}
