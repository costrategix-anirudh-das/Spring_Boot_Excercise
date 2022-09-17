package spring_demo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Run hard 5k";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Just Do it: " + fortuneService.getFortune();
	}

}
