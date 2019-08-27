
public class League {
private String season;
private String title;
private int year;
public String getSeason() {
	return season;
}
public void setSeason(String season) {
	this.season = season;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public League(String title, String season, int year) {
	super();
	this.season = season;
	this.title = title;
	this.year = year;
}
public League() {
	super();
}

}
