package com.example.demo.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.GuitarModel;

public class GuitarDaoImpl implements GuitarDao{
	
//	@Autowired
//	private SessionFactory sessionFactory;
//	
//	@Override
//	public boolean save(GuitarModel guitar) {
//		boolean status = false;
//		try {
//			sessionFactory.getCurrentSession().save(guitar);
//			status = true;
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return status;
//	}
}
