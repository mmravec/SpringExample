package java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleConfiguration {
	@Bean(name="bar")
	public Bar bar1() {
		return new Bar();
	}
	
	@Bean
	public Bar bar2() {
		return new Bar();
	}

	@Bean
	public Foo foo() {
		return new Foo();
	}
}
