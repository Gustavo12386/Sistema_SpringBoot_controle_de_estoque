package com.aplicacaospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacaospring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
