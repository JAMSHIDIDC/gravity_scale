package com.gravityScale.gravityScale.model;


import java.time.LocalDateTime;
import java.util.Date;

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

@Entity
@Table(name= "Machines")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Machines {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private Users user;
	
	@Column(name = "machine_name")
	private String machineName;
	
	@Column(name = "machine_model")
	private String machineModel;
	
	@Column(name = "warrentyPeriod")
	private int warrentyPeriod;
	
	@Column(name = "stamped_on")
	private Date stampedOn;
	
	@Column(name = "next_stamping_due")
	private Date nextStampingDue;
	
	@Column(name = "status")
	private boolean status;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

}
