package com.motor.insurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.motor.insurance.entity.User;

public interface UserDao extends CrudRepository<User, Integer>,JpaRepository<User, Integer>{

}
