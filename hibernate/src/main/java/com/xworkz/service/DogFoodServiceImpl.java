package com.xworkz.service;

import com.xworkz.dao.DogFoodDAO;
import com.xworkz.dao.DogFoodDAOImpl;
import com.xworkz.entity.DogFood;

public class DogFoodServiceImpl implements DogFoodService {
	
	@Override
	public boolean validation(DogFood dogFood) {
		DogFoodDAOImpl dogFoodDAOImpl = new DogFoodDAOImpl();
		boolean flag = false;
	
		System.out.println("----------SERVICE CLASS----");
		if (dogFood.getName() != null) {
			System.out.println("Dog food name is valid");
		} else {
			System.out.println("Food name is Not valid");
		}
		if (dogFood.getPrice() > 0) {
			System.out.println("valid price");
		} else {
			System.out.println("food price is not valid");
		}
		if (dogFood.getQuality() != null) {
			System.out.println("good food quality");
		} else {
			System.out.println("food quality is not good");
		}
		if (dogFood.getQuantity() != null) {
			System.out.println("valid quantity");
		} else {
			System.out.println("food quantity is not valid");
		}
		System.out.println("======"+flag);
		return flag;

	}

}
