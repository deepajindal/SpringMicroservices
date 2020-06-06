package spring.ioc.service;

public class BadFortuneService implements FortuneService{

	@Override
	public String getDailyFortune() {
		return "Bad Fortune";
	}

}
