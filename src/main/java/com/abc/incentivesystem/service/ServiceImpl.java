package com.abc.incentivesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.incentivesystem.dao.IBookingDao;
import com.abc.incentivesystem.entity.Booking;
import com.abc.incentivesystem.entity.Car;

@Service
public class ServiceImpl implements BookingService {

	@Autowired
	private IBookingDao bookingDao;

	@Override
	public Booking AddBooking(Booking booking) {
		Booking newBooking = bookingDao.save(booking);
		return newBooking;
	}

	@Override
	public Booking updateCarBooking(Car car, int bookingId) {
		Booking newbBooking= bookingDao.getById(bookingId);
		newbBooking.setCar(car);
		bookingDao.save(newbBooking);
		return newbBooking;
	}

	@Override
	public void removeBooking(Booking booking) {
		bookingDao.delete(booking);

	}

	@Override
	public List<Booking> getAllBooking() {
		List<Booking> bookings = bookingDao.findAll();
		return bookings;
	}

	@Override
	public Booking getBookingById(int bookingId) {
		Booking booking = bookingDao.findById(bookingId).get();
		return booking;
	}

}
