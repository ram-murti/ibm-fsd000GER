package assessQno1A2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator {
	List<Employee> d=new ArrayList<Employee>();
	public void Sortbyage(List<Employee> d) {
		Collections.sort(d, new AgeComparator());
		System.out.println(d.toString());
	}
	@Override
	public int compare(Object e1, Object e2) {
		Employee s1=(Employee)e1;
		Employee s2=(Employee)e2;
		if(s1.getAge()==s2.getAge()) {
		         if(s1.getDateOfJoining().after(s2.getDateOfJoining()) ) {
		        	 return 1;
		         }
		         else if(s1.getDateOfJoining().before(s2.getDateOfJoining())) {
		        	 return -1;
		         }
		         else {
		        	 return 0;
		         }
		}
		else if(s1.getAge()>s2.getAge()) {
			
			return 1;}
		else {
			
			return -1;}
	}

}
