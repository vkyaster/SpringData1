package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService")FortuneService fortuneService)
	{
		System.out.println("0");
		this.fortuneService = fortuneService;
		System.out.println("1");
	}
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "getDailyWorkOut";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "getDailyFortune";
	}

	
	//define my init method
	@PostConstruct
	public void doMyStartup()
	{
		System.out.println("doMyStartup");
	}
	//define my destroy method
	@PreDestroy
	public void doMyCleanUp()
	{
		System.out.println("doMyStartup");
	}
}
