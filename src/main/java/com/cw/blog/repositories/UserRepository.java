package com.cw.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cw.blog.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
