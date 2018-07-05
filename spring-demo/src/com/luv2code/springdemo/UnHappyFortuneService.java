package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class UnHappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your not lucky day!....";
	}

}
