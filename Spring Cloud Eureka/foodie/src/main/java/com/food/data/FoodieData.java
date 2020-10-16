package com.food.data;

import java.util.ArrayList;

public class FoodieData {

	private ArrayList<MenuData> FoodMenu;
	private long responseCode;
	private String responseMessage;
	public ArrayList<MenuData> getFoodMenu() {
		return FoodMenu;
	}
	public void setFoodMenu(ArrayList<MenuData> foodMenu) {
		FoodMenu = foodMenu;
	}
	public long getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(long responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
}
