package com.anil.java;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	
	/*@Autowired
	private SessionFactory sessionFactory;*/
	
	/*@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public String data() {

		Session a = sessionFactory.openSession();

		String queryString = "select * from employee";
		Query s = a.createQuery(queryString);

		List s2 = s.list();

		System.out.println(s2.size());

		return null;
	}*/
	
	@Autowired
	SessionFactory sessionFactory;
	
	public String data() {

		Session a = sessionFactory.openSession();

		
		
		String queryString = "select * from user_details";
		
		List<Object[]> s2 = a.createSQLQuery(queryString).list();

		System.out.println(s2.size());
		
		for (Object[] object : s2) {
			
			System.out.println((String)object[1]);
		}

		return null;
	}
	
	

}
