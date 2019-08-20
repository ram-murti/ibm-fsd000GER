package Listexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ListDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Collection<String> list=new ArrayList<String>();
   list.add("John");
   list.add("Ram");
   Set<String> set=new HashSet<String>();
   set.add("hello");
   list.addAll(set);
   System.out.println(list);
   list.removeAll(set);
   System.out.println(list);
	}

}
