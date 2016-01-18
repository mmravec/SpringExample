package spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("guessNumber")
public class GuessNumber {
	@Value("#{ T(java.lang.Math).random() * 100.0 }")
	private int value;
	
	public int getValue() {
		return value;
	}
}
