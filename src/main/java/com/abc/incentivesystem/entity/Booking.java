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

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Incentive getIncentive() {
		return incentive;
	}

	public void setIncentive(Incentive incentive) {
		this.incentive = incentive;
	}
}
