package com.springmvcorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springmvcorm.dao.SpringOrmDAOInterface;
import com.springmvcorm.entity.FacebookEmployee;

@Component
public class SpringOrmService implements SpringOrmServiceInterface{
	@Autowired
	private SpringOrmDAOInterface dao;

	public int registerUserService(FacebookEmployee fe) {
		// TODO Auto-generated method stub
		return dao.registerUserDAO(fe);
	}
}
