package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Employee;

public class InsertEmployee {
	public static void main(String[] args) {
		//应用程序托管
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa_link");
		EntityManager entitymanager = emFactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setId("001");
		employee.setName("ABC");
		employee.setSalary(40000);
		employee.setDeptId(1);
		
		entitymanager.persist(employee);
		entitymanager.getTransaction().commit();
		System.out.println("添加成功");
		
		entitymanager.close();
		emFactory.close();
	}
}
