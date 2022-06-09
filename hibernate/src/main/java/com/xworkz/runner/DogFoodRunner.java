package com.xworkz.runner;

import com.xworkz.dao.DogFoodDAO;
import com.xworkz.dao.DogFoodDAOImpl;
import com.xworkz.entity.DogFood;
import com.xworkz.service.DogFoodService;
import com.xworkz.service.DogFoodServiceImpl;

public class DogFoodRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogFood dogFood = new DogFood("Tommy",25000,"No.1","7kg");
		DogFoodService dogFoodService = new DogFoodServiceImpl();
		boolean val=dogFoodService.validation(dogFood);
		
		val=true;
		
		System.out.println("------------RUNNER CLASS--------");
		System.out.println(val);
		if(val) {
			DogFoodDAOImpl dogFoodDAOImpl = new DogFoodDAOImpl();
			dogFoodDAOImpl.saveDogFood(dogFood);
			System.out.println("DATA SAVED SUCCESSFULLY!!!!!!!!!!!!!!!!");
		}else {
			System.out.println("THIS IS NOT VALID PROGRAM");
		}
	
		
	}

}
