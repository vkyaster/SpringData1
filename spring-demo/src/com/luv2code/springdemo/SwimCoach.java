package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	
	@Value("${foo.email}")
	public String email;
	
	@Value("${foo.team}")
	public String team;
	
	
	public void display()
	{
		System.out.println(email+" : "+team);
	}
	public SwimCoach(FortuneService thsFortuneService)
	{
		fortuneService = thsFortuneService;
	}
	@Override
	public String getDailyWorkOut() {
		return "Swim 1000 mtr as warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
