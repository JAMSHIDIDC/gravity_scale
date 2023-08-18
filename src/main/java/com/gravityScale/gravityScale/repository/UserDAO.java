package com.gravityScale.gravityScale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gravityScale.gravityScale.model.Users;

@Repository
public interface UserDAO extends JpaRepository<Users, Long>{

}
