package com.gravityScale.gravityScale.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "product_images")
public class ProductImages {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
    @JoinColumn(name="machine_id", nullable=false)
    private Machines machines;
	
	@ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private Users user;
	
	@Enumerated(EnumType.STRING)
	private ImageCategory imageCategory;
	
	@Lob
	
	private byte[] imageData;
	 
	@Column(name = "status") 
	private boolean status;
	
	
	public enum ImageCategory {
		DISPLAYIMAGE, 
		REPORTEDIMAGE
    }

}
