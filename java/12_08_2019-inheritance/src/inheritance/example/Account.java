package inheritance.example;

public class Account {
public String name;
public int accountno;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAccountno() {
	return accountno;
}
public void setAccountno(int accountno) {
	this.accountno = accountno;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + accountno;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Account other = (Account) obj;
	if (accountno != other.accountno)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
} 
public static void main(String[] args) {
	Account e=null;
	Account a=null;
	e= new Account();
	a= new Account();
	e.setAccountno(1000);
	a.setAccountno(2000);
	System.out.println(a.equals(e));
}
}
