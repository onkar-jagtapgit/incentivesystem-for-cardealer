package com.abc.incentivesystem.service;

import java.util.List;

import com.abc.incentivesystem.entity.Booking;
import com.abc.incentivesystem.entity.Car;



public interface BookingService {
	public Booking AddBooking(Booking booking);
	public Booking updateCarBooking(Car car, int bookingId);
	public void removeBooking(Booking booking);
	public List<Booking> getAllBooking();
	public Booking getBookingById(int bookingId);

}
