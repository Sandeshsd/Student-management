package com.mvc_demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.mvc_demo.dto.Student;

@Component
public class StudentDAO {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sandy");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void saveStudent(Student student) {
		et.begin();
		em.persist(student);
		et.commit();
	}
}
