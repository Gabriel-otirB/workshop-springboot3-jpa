package com.educandoweb.coursePratice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursePratice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
