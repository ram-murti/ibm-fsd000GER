package Common.example;

public class Checkfnamelname extends Throwable {
private String message;
private static final long serialversionUID=-462L;
public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public Checkfnamelname(String message) {
	super();
	this.message = message;
}

public Checkfnamelname() {
	super();
}

}
