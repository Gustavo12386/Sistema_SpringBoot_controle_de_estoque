package com.aplicacaospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacaospring.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
