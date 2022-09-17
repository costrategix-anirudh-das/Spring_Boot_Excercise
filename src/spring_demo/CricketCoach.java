package spring_demo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//add  new fields for emailaddress and team
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("setting email");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("setting team");
		this.team = team;
	}


	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside constructor");
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practise fast bowling for 15 minutes";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
