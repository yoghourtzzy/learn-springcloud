package com.example.microservicesimpleprovideruser.dao;

import com.example.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @program: micro-service-simple-provider-main
 * @description:
 * @author: zzy
 * @create: 2019-05-19 17:17
 **/
@Repository
public interface  UserRepository extends JpaRepository<User, Long> {
}



