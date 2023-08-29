package com.educandoweb.coursePratice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursePratice.entities.OrderItem;
import com.educandoweb.coursePratice.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
