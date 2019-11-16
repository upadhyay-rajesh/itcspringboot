package com.springmvcorm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.springmvcorm.entity.FacebookEmployee;

@Component
public class SpringOrmDAO implements SpringOrmDAOInterface{
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public int registerUserDAO(FacebookEmployee fe) {
		int i=0;
		EntityManager em=entityManagerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
			em.persist(fe);
		et.commit();
		i=1;
		return i;
	}
}
