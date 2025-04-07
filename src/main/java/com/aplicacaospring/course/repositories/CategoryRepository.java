package com.aplicacaospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacaospring.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
