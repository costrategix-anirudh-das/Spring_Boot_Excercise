package spring_demo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//Define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting";
	}

	
	// runtime polymorphism
	
	@Override
	public String getFortune() {
		
		//use my fortuneService to get a fortune
		
		return fortuneService.getFortune();
	}
}
