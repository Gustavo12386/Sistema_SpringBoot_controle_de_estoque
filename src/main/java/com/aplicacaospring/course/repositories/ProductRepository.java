package com.aplicacaospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacaospring.course.entities.Category;
import com.aplicacaospring.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
