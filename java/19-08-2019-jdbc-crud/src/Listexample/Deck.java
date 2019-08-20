package Listexample;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deck {
	static int hands;
	static int Persons;
	static int i=0;
public static void main(String[] args) {
	List<Card> d=new ArrayList<Card>();
	for(Suit s:Suit.values()) {
		for(Rank r:Rank.values()) {
			d.add(new Card(s,r));
			i++;
		}
	}
	
		System.out.println(d.toString());
	
	
}

  
}
