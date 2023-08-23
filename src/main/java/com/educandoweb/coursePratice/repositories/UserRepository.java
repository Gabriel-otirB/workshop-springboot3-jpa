package com.educandoweb.coursePratice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursePratice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
