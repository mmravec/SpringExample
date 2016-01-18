package java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(SimpleConfiguration.class);

		
		Bar bar = context.getBean("bar", Bar.class);
		System.out.println(bar);
	}
}
