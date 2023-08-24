package com.edubridge.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.edubridge.onlinebookstore.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}