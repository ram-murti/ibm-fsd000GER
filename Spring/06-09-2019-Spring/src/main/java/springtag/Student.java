package springtag;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Student {
 private String first_name;
 private String last_name;
 private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	@Override
	public String toString() {
		return "Student [operatingSystems=" + Arrays.toString(operatingSystems) + "]";
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public Student() {
		
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<String, String>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");		

	}

public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public Student(String first_name, String last_name) {
	super();
	this.first_name = first_name;
	this.last_name = last_name;
}

public LinkedHashMap<String, String> getCountryOptions() {
	return countryOptions;
}

 
}
