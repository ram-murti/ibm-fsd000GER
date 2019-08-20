package Listexample;

public class Card {
private Suit suit;
private Rank ra;
public Suit getSuit() {
	return suit;
}
public void setSuit(Suit suit) {
	this.suit = suit;
}
public Rank getRa() {
	return ra;
}
public void setRa(Rank ra) {
	this.ra = ra;
}
public Card(Suit suit, Rank ra) {
	super();
	this.suit = suit;
	this.ra = ra;
}
public Card() {
	super();
};
public String toString() {
	return "deck[suit=" +suit +"rank=" +ra +"]"+"\n";
	
}
}
