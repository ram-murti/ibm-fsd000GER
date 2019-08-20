package comm.example;

public class MyDate {
		private int day;
		private int month;
		private int year;
		
		public void createdate(int d,int m,int y)
		{
			if(d>30)
			{
				System.out.println("day can't >30");
				System.exit(0);
			}
			else if(y<1990 && y>2019) {
				System.out.println("year wrong");
				System.exit(0);
			}
			else if( m>12) {
				System.out.println("year wrong");
				System.exit(0);	}
			
			else {
			day=d;
			month= m;
			year=y;
		}
		}
		public String getDate() {
			return "Date is "+ day +": " + month + ":" + year ;
		}
}

