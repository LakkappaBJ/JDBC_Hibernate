package com.xworkz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.DogFood;

public class DogFoodDAOImpl implements DogFoodDAO {
	static Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(DogFood.class);

	@Override
	public void saveDogFood(DogFood dogFood) {
		System.out.println("Hibernate connection framework start");
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		Session session=buildSessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		session.save(dogFood);
		beginTransaction.commit();
		session.close();
	}

}
