package assessQno3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import assessQno1A2.Employee;

public class Country implements Comparable {
	
	 List<Country> outer = new ArrayList<Country>();
	 List<State> inner = new ArrayList<State>(); 

private String countryName;
private List<State> state=new ArrayList<State>();
static boolean p=false;

	

	public Country(String countryName, List<State> state) {
	super();
	this.countryName = countryName;
	this.state = state;
}

	public Country() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object c) {
		// TODO Auto-generated method stub
		Country co=(Country)c;
		int compare=this.getCountryName().compareTo(co.countryName);
		if(compare==0) {
			return 0;
		}else if(compare==1) {
			
		return -1;}
		else
			return 1;
	}

	public String getCountryName() {
		
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@SuppressWarnings("unchecked")
	public void AddStateList(String name,String countryname) {
		 for(Country emp:outer) {
			System.out.println(countryname.equalsIgnoreCase(emp.getCountryName()));
				if(countryname.equalsIgnoreCase(emp.getCountryName())) {
					inner=emp.state;
					 p=countryname.equalsIgnoreCase(emp.getCountryName());
					System.out.println("same");
					break;
				}
			}
		 if(p==true) {
			 System.out.println("true loop");
		 inner.add(new State(name));
		 Collections.sort(inner);
		 p=false;
		 }
		 else {
			 List<State> inner1 = new ArrayList<State>();
			 System.out.println(inner.toString());
			 inner1.add(new State(name));
		 outer.add(new Country(countryname,inner1));}
		 Collections.sort(outer);
	   System.out.println(outer.toString());
	   
	}

	

	

	public List<State> getState() {
		return state;
	}

	public void setState(List<State> state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", state=" + state + "]";
	}
	
}
