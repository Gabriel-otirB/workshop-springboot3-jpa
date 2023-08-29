package com.educandoweb.coursePratice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursePratice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
