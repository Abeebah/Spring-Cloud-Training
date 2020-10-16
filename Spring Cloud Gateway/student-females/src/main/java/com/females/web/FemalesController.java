package com.females.web;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.females.data.FemalesModel;


@RestController
public class FemalesController {

	@GetMapping("/females")
	public FemalesModel getMales() {
		
		ArrayList<String> femaleStudents = new ArrayList<String>();
		femaleStudents.add("Khairat");
		femaleStudents.add("Elizabeth");
		femaleStudents.add("Oluranti");
		femaleStudents.add("Hilda");
		FemalesModel females = new FemalesModel();
		females.setFemales(femaleStudents);
		
		return females;
		
	} 
}
