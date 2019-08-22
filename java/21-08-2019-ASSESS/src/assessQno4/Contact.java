package assessQno4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import assessQno1A2.Employee;

public class Contact implements Comparable{
private String name;
private String email;
private Long mobile;
private String address;
List<Contact> d=new ArrayList<Contact>();
@Override
public String toString() {
	return "Contact [name=" + name + ", email=" + email + ", mobile=" + mobile + ", address=" + address + ", d=" + d
			+ "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Contact(String name, String email, Long mobile, String address) {
	super();
	this.name = name;
	this.email = email;
	this.mobile = mobile;
	this.address = address;
}
public void AddContactDetails(String name,String email,Long mobile,String address) {
	d.add(new Contact(name,email,mobile,address));
}
public void ViewContactDetails() {
	Collections.sort(d);
	for(Contact emp:d) {
		System.out.println(emp.getAddress()+"-"+emp.getMobile());
	}
}
public Contact() {
	super();
}
@Override
public int compareTo(Object e) {
	Contact obj=(Contact)e;
	if(this.getMobile()==obj.mobile) {
		return 0;
	}
	else if(this.getMobile()<obj.mobile) {
		return 1;
	}
	else {
		return -1;
	}
}
}
