package com.males.web;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.males.data.MalesModel;

@RestController
public class MalesController {

	
	@GetMapping("/males")
	public MalesModel getMales() {
		
		ArrayList<String> maleStudents = new ArrayList<String>();
		maleStudents.add("Buhari");
		maleStudents.add("Tinubu");
		maleStudents.add("Jonathan");
		maleStudents.add("Obasanjo");
		MalesModel males = new MalesModel();
		males.setMales(maleStudents);
		
		return males;
		
	} 
}
