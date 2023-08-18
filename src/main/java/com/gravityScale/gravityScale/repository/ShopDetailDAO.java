package com.gravityScale.gravityScale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gravityScale.gravityScale.model.ShopDetails;


public interface ShopDetailDAO extends JpaRepository<ShopDetails, Long>{
	
}
