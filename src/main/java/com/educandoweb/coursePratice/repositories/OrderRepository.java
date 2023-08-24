package com.educandoweb.coursePratice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursePratice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
