package com.food.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.data.FoodieData;
import com.food.service.FoodieService;



@RestController
@RequestMapping("/food")
public class FoodieController {

	
	@Autowired
	FoodieService foodiesvc;
	
	@GetMapping("/menu")
	public FoodieData fetchAllMenu() {
	
		FoodieData foodData = foodiesvc.getMenu();
		return foodData;
	
}
	
}
