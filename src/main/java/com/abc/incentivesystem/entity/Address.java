package com.abc.incentivesystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adress_tbl")
public class Address {
	
	@Id
	@Column(name = "door_no")
	private String doorNo;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "pincode")
	private int pincode;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
}
