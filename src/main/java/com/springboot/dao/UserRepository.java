package com.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.User;

@Repository
	public interface UserRepository extends JpaRepository<User, String> {

	}

