package inheritance.example;

public class Book extends Product {
   public String name;
   public String author;
   
   public Book(String name,String author,int currentrate) {
	   super(currentrate);
	   this.name=name;
	   this.author=author;
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getdetails() {
	return super.getdetails() + " author: " + this.author + " name: "+this.name;
}

}
