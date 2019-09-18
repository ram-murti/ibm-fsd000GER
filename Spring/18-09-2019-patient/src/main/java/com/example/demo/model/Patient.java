package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String patientname;
	private String patientdisease;
	public Patient() {
		super();
	}
	public Patient(String patientName, String patient_disease) {
		super();
		this.patientname = patientName;
		this.patientdisease = patient_disease;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientname;
	}
	public void setPatientName(String patientName) {
		this.patientname = patientName;
	}
	public String getPatientDisease() {
		return patientdisease;
	}
	public void setPatientDisease(String patient_disease) {
		this.patientdisease = patient_disease;
	}
	
}