package Spring._09_2019_Spring1;

public class CricketCoach implements Coach {
   GetDailyFortuneService get;
	public GetDailyFortuneService getGet() {
	return get;
}

public void setGet(GetDailyFortuneService get) {
	this.get = get;
}

	public String getDailyRoutine() {
		// TODO Auto-generated method stub
		return "CricketCoach";
	}

	public String getFortuneDetail() {
		// TODO Auto-generated method stub
		return get.getDailyFortuneService();
	}

}
