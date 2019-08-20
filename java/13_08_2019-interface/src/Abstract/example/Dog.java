package Abstract.example;

public class Dog implements LivingThings {
public String name;
public String breed;
public Dog(String name,String breed) {
	this.name=name;
	this.breed=breed;
}
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
public void createLivingThings() {
	System.out.println("aa");
	LivingThings livingThings= new LivingThings() {
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println(" Dog Name: "+getName()+", DogBreed: "+getBreed()+" can also walk");
	}
	};
	livingThings.walk();
}
@Override
public void walk() {
	// TODO Auto-generated method stub
	
}
}
