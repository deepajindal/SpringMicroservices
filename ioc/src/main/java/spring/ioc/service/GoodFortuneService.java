package spring.ioc.service;

public class GoodFortuneService implements FortuneService{

	@Override
	public String getDailyFortune() {
		return "Good Fortune";
	}

}
