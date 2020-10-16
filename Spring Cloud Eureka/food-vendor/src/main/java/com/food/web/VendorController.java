package com.food.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.data.FoodVendor;
import com.food.data.Vendor;
import com.food.service.VendorService;


@RestController
@RequestMapping("/food")
public class VendorController {

@Autowired
VendorService vendorsvc;

@PostMapping("/vendor")
public FoodVendor createVendor(@RequestBody Vendor vendor) {
	FoodVendor myVendor =vendorsvc.addVendor(vendor);
	return myVendor;
}


@GetMapping("/vendor/{userId}")
public Vendor fetchVendor(@PathVariable("userId") long userId) {
	Vendor vendor = vendorsvc.getVendor(userId);
	return vendor;
	
}


}
