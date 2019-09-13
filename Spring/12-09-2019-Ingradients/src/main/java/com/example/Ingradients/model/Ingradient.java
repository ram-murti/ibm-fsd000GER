package com.example.Ingradients.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;


@Entity
public class Ingradient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private Double amount;
public String name;
@Lob
private String description;
@ManyToMany(mappedBy = "ingradient")
private Set<Receipe> receipe = new HashSet<>();


public Ingradient() {
	super();
}

public Ingradient(Double amount, String description) {
	super();
	this.amount = amount;
	this.description = description;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Set<Receipe> getReceipe() {
	return receipe;
}
public void setReceipe(Set<Receipe> receipe) {
	this.receipe = receipe;
}

public Ingradient(Double amount, String name, String description) {
	super();
	this.amount = amount;
	this.name = name;
	this.description = description;

}

}
