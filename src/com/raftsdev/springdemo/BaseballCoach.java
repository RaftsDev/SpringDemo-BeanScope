package com.raftsdev.springdemo;

public class BaseballCoach implements Coach{
	
	
	
	private FortuneService fortuneService;
	
	BaseballCoach (FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
