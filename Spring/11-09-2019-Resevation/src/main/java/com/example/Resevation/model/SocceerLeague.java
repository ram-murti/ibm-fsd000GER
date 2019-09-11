package com.example.Resevation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SocceerLeague {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String season;
	
	@Override
	public String toString() {
		return "SocceerLeague [id=" + id + ", title=" + title + ", season=" + season + "]";
	}
	public SocceerLeague() {
		super();
	}
	public SocceerLeague(String title, String season) {
		super();
		this.title = title;
		this.season = season;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	
}
