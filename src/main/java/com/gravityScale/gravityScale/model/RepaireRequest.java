package com.gravityScale.gravityScale.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "repaire_request")
public class RepaireRequest {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private Users userDetails;
	
	@ManyToOne
    @JoinColumn(name="machine_id", nullable=false)
    private Machines machines;
	
	@Column(name = "machine_name")
	private String machineName;
	
	@Column(name = "reson")
	private String reasonToContact;
	
	@Column(name = "requested_date")
	private Date requestedDate;
	
	@Column(name = "address")
	private String address;
	
	

}
