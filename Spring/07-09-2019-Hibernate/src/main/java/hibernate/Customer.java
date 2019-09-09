package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Data

public class Customer {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@NonNull
	@Column(name = "id")
	private int id;
	@Column(name = "fName")
	//@Range(min = 5, max = 10)
	private String firstName;
	//@Range(min = 5, max = 10)
	@Column(name = "lName")
	private String lastName;
	//@javax.validation.constraints.Email
	@Column(name = "email")
	private String email;

	public Customer(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

}
