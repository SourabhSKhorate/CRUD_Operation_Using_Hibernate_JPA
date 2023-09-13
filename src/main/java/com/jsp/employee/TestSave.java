package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sk");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("MAYUR");
		employee.setEmail("patil@mail.com");
		employee.setCno(9856789854l);

		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();

	}

}
