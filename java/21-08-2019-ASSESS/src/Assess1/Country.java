package Assess1;

import java.util.ArrayList;
import java.util.List;

import Assess.Employee;

public class Country implements Comparable {
	List<Country> d=new ArrayList<Country>();
private String countryName;
private Object state;
	public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public Object getState() {
	return state;
}
public void setState(Object state) {
	this.state = state;
}
	@Override
	public int compareTo(Object c) {
		// TODO Auto-generated method stub
		Country co=(Country)c;
		if(this.getCountryName()==co.countryName) {
			
		}
		return 0;
	}
	
}
