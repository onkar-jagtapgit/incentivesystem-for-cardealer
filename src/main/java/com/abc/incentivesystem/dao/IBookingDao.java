package com.abc.incentivesystem.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.abc.incentivesystem.entity.Booking;

public interface IBookingDao extends JpaRepository<Booking, Integer> {	
	
	
	@Query(value="select a from Booking a where a.bookingId= :bId")
	public Optional<Booking> getBookingByID(@Param("bId") int bookingId);
}
