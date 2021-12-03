package com.abc.incentivesystem.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "booking_tbl")
public class Booking {

	
	@Id
	@Column(name = "booking_id")
	private int bookingId;

	@Column(name = "booking_date")
	private LocalDate bookingDate;

	@OneToOne(mappedBy = "booking")
	private Customer customer;

	@OneToOne
	private Car car;

	@OneToOne
	private Incentive incentive;
}
