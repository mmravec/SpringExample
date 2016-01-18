package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mc")
public class MyComponent {
	private OtherComponent otherComponent;
	
	public MyComponent() {
		System.out.println("Calling MyComponent()");
	}

	public OtherComponent getOtherComponent() {
		return otherComponent;
	}
	
	@Autowired
	public void setOtherComponent(OtherComponent otherComponent) {
		System.out.println("Calling setOtherComponent");
		this.otherComponent = otherComponent;
	}
}
