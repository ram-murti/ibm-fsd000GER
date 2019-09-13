package com.example.Ingradients.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
@Entity
public class Receipe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
public String name;	
private Long cooktime;
private Long servingtime;
private String difficulties;

@OneToOne(cascade=CascadeType.ALL,mappedBy = "receipe")
private Note note;
@ManyToMany
@JoinTable(name = "receipe_details", joinColumns = @JoinColumn(name = "receipe_id"), inverseJoinColumns = @JoinColumn(name = "ingradient_id"))
private Set<Ingradient> ingradient = new HashSet<>();

public Receipe() {
	super();
}

public Receipe(Long cooktime, Long servingtime, String difficulties) {
	super();
	
	this.cooktime = cooktime;
	this.servingtime = servingtime;
	this.difficulties = difficulties;
}

public Receipe(String name, Long cooktime, Long servingtime, String difficulties, Note note) {
	super();
	this.name = name;
	this.cooktime = cooktime;
	this.servingtime = servingtime;
	this.difficulties = difficulties;
	this.note = note;
}

public Receipe(Long cooktime, Long servingtime, String difficulties, Set<Ingradient> ingradient) {
	super();
	this.cooktime = cooktime;
	this.servingtime = servingtime;
	this.difficulties = difficulties;
	this.ingradient = ingradient;
}

public Receipe(Long cooktime, Long servingtime, String difficulties, Note note) {
	super();
	this.cooktime = cooktime;
	this.servingtime = servingtime;
	this.difficulties = difficulties;
	this.note = note;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Long getCooktime() {
	return cooktime;
}
public void setCooktime(Long cooktime) {
	this.cooktime = cooktime;
}
public Long getServingtime() {
	return servingtime;
}
public void setServingtime(Long servingtime) {
	this.servingtime = servingtime;
}
public String getDifficulties() {
	return difficulties;
}
public void setDifficulties(String difficulties) {
	this.difficulties = difficulties;
}
public Note getNote() {
	return note;
}
public void setNote(Note note) {
	this.note = note;
}
public Set<Ingradient> getIngradient() {
	return ingradient;
}
public void setIngradient(Set<Ingradient> ingradient) {
	this.ingradient = ingradient;
}

}
