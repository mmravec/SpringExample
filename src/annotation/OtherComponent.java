package annotation;

import org.springframework.stereotype.Component;

@Component
public class OtherComponent {
	public OtherComponent() {
		System.out.println("Calling OtherComponent()");
	}
}
