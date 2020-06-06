package spring.ioc.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.ioc.service.FortuneService;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Cricket workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
