package com.aplicacaospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacaospring.course.entities.OrderItem;
import com.aplicacaospring.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
