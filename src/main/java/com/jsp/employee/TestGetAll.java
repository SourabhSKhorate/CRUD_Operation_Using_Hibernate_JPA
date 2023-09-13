package com.jsp.employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sk");// connection
		EntityManager entityManager = entityManagerFactory.createEntityManager();// create CRUD statement // update in
																					// database

		String sql = "SELECT e FROM Employee e";
		Query query = entityManager.createQuery(sql);

		List<Employee> employees = query.getResultList();

		for (Employee e : employees) {
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getEmail());
			System.out.println(e.getCno());
			System.out.println("=================");

		}

	}

}
