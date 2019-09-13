package com.example.Ingradients.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@Lob
private String recipie_note;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="Receipe_id")
private Receipe receipe;

public Receipe getReceipe() {
	return receipe;
}
public void setReceipe(Receipe receipe) {
	this.receipe = receipe;
}
public Note(String recipie_note, Receipe receipe) {
	super();
	this.recipie_note = recipie_note;
	this.receipe = receipe;
}
public Note() {
	super();
}
public Note(String recipie_note) {
	super();
	this.recipie_note = recipie_note;
}

public String getRecipie_note() {
	return recipie_note;
}
public void setRecipie_note(String recipie_note) {
	this.recipie_note = recipie_note;
}
}
