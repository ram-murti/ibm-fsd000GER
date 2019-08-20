package Common.example;

public class TennisCoach implements Coach {
	public String name;
	public Level level;

	public TennisCoach(String name, Level level) {
		super();
		this.name = name;
		this.level = level;
	}

	public TennisCoach() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public void createCoach(String name, Level level) {
		this.setName(name);
		this.setLevel(level);
	}

	public String getcoachDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append("Todays"+getDailyWorkOut()+"\n");
		sb.append("name" + getName()+"\n");
		sb.append("level" + getLevel()+"\n");
		sb.append("To"+getLevel()+"\n");
		return sb.toString();
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice back volley today";
	}
}
