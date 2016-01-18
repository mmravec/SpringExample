package spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestSpel {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello World'.toUpperCase()");
		String message = exp.getValue(String.class);	
		System.out.println(message);
	}
}
