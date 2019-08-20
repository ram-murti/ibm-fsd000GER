package comm.example;

public class MyDate1 {
  private int day;
  private int month;
  private int year;
  public int getday() {
		 return day;
	 }
	 public int  getmonth() {
		 return month;
	 }
	 public int  getyear() {
	       return year;
	 }
	 public boolean setDay(int d) {
		 if(d>30) {
			 System.out.println("wrong ");
			 return false;
		 }
		 else {
			 day=d;
			 return true;
		 }
	 }
	 public boolean setMonth(int m) {
		 if(m>12) {
			 System.out.println("wrong ");
			 return false;
		 }
		 else {
			 month=m;
			 return true;
		 }
	 }
	 public boolean setYear(int y) {
		 if(y>2019) {
			 System.out.println("wrong ");
			 return false;
		 }
		 else {
			 year=y;
			 return true;
		 }
	 }
	
 

}
