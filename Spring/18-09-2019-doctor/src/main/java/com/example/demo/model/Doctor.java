package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String doctorname;
	private String doctorspeciality;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoctorName() {
		return doctorname;
	}

	public void setDoctorName(String doctorName) {
		this.doctorname = doctorName;
	}

	public String getDoctorSpeciality() {
		return doctorspeciality;
	}

	public void setDoctorSpeciality(String doctorSpeciality) {
		this.doctorspeciality = doctorSpeciality;
	}

	public Doctor() {
		super();
	}

	public Doctor(String doctorName, String doctorSpeciality) {
		super();
		this.doctorname = doctorName;
		this.doctorspeciality = doctorSpeciality;
	}
	
	
}