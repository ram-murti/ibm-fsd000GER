package assessQno3;

public class State implements Comparable{
private String name;

@Override
public String toString() {
	return   name ;
}

public State() {
	super();
}

public State(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@Override
public int compareTo(Object c) {
	// TODO Auto-generated method stub
	State co=(State)c;
	int compare=this.getName().charAt(0)-co.name.charAt(0);
	if(compare==0) {
		return 0;
	}else if(compare>0) {
		
	return 1;}
	else
		return -1;
}
}
