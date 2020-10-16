package com.food.data;

import java.util.ArrayList;

public class FoodMenuModel {

	
	private String fullname;
	private long Id;
	private ArrayList<MenuData> FoodMenu;
	
	

	public ArrayList<MenuData> getFoodMenu() {
		return FoodMenu;
	}
	public void setFoodMenu(ArrayList<MenuData> foodMenu) {
		FoodMenu = foodMenu;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	
	
	
}
