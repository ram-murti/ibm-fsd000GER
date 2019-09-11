package com.example.Resevation.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.Resevation.model.Flight;
import com.example.Resevation.model.Passenger;
import com.example.Resevation.model.Reservation;
import com.example.Resevation.repository.FlightRepository;
import com.example.Resevation.repository.PassengerRepository;
import com.example.Resevation.repository.ReservationRepository;

@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent> {

	private FlightRepository flightRepository;
	private ReservationRepository reservationRepository;
	private PassengerRepository passengerRepository;

	public DevJpaBootStrap(FlightRepository flightRepository, ReservationRepository reservationRepository,
			PassengerRepository passengerRepository) {
		super();
		this.flightRepository = flightRepository;
		this.reservationRepository = reservationRepository;
		this.passengerRepository = passengerRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		Reservation res = new Reservation();
		res.setSeatno("12");
		reservationRepository.save(res);

		Flight flight = new Flight("Indigo");
		Passenger pass = new Passenger("Ram", "murti", res);
		flight.getPassenger().add(pass);
		pass.getFlight().add(flight);
		flightRepository.save(flight);
		passengerRepository.save(pass);
		Flight flight1 = new Flight("AirAsia");
		Passenger pass1 = new Passenger("Ra", "mur", res);
		flight1.getPassenger().add(pass1);
		pass1.getFlight().add(flight1);
		flightRepository.save(flight1);
		passengerRepository.save(pass1);
	}

}
