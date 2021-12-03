package com.abc.incentivesystem.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer_tbl")
public class Customer {
	
	@Id
	@Column(name = "customer_id")
	private String customerId;

	@Column(name = " customer_name")
	private String name;

	@Column(name = "phone_no")
	private String contactNo;

	@Column(name = "email")
	private String email;
	
	@OneToMany(mappedBy = "customer")
	private List<Address> adresses;
	
	@OneToOne(mappedBy = "customer")
	private Booking booking;
}
