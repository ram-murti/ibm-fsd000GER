package Serial;

import java.io.Serializable;

public class Employee implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -2737394428225922071L;
private String id;
private String name;
private transient String address;
public Employee(String id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	
}
@Override
public String toString() {
	return "Serilizable [id=" + id + ", name=" + name + ", address=" + address + "]";
}
public Employee() {
	super();
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
