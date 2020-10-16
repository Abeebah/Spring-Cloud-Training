package com.food.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.food.data.FoodVendor;
import com.food.data.Vendor;

@Service
public class VendorService {

	long i = 1;
	FoodVendor foodvendors = new FoodVendor();
	ArrayList<Vendor> vendorList = new ArrayList<Vendor>();

	public FoodVendor addVendor(Vendor vendor) {
		vendor.setId(i++);
		vendorList.add(vendor);
		foodvendors.setFoodvendor(vendorList);
		return foodvendors;
	}

	public Vendor getVendor(long userId) {
		Vendor vendor = new Vendor();
		for (int i = 0; i < foodvendors.getFoodvendor().size(); i++) {

			ArrayList<Vendor> Vendors = foodvendors.getFoodvendor();
			if (userId == Vendors.get(i).getId()) {
				vendor.setFullname(Vendors.get(i).getFullname());
				vendor.setId(Vendors.get(i).getId());
				return vendor;
			}
		}
		return vendor;
	}

}
