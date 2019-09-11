package com.example.Resevation.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fName;
	private String lName;
	@OneToOne
	private Reservation reservation;
	@ManyToMany
	@JoinTable(name = "reservation_details", joinColumns = @JoinColumn(name = "passenger_id"), inverseJoinColumns = @JoinColumn(name = "flight_id"))
	private Set<Flight> flight = new HashSet<>();

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Set<Flight> getFlight() {
		return flight;
	}

	public void setFlight(Set<Flight> flight) {
		this.flight = flight;
	}

	public Passenger(Long id, String fName, String lName, Reservation reservation, Set<Flight> flight) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.reservation = reservation;
		this.flight = flight;
	}

	public Passenger(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}

	public Passenger() {
		super();
	}

	public Passenger(String fName, String lName, Reservation reservation) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.reservation = reservation;
	}

}
