package com.gravityScale.gravityScale.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name= "shop_details")
public class ShopDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private Users userDetails;
	
	@Column(name = "shop_name")
	private String shopName;
	
	@Column(name = "shop_address")
	private String shopAddress;
	
	@Column(name = "shop_nature")
	private String shopNature;
	
	@Column(name = "shop_location")
	private String shopLocation;
	
	@Column(name = "status")
	private boolean status;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
}
