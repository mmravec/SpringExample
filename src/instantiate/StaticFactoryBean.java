package instantiate;

import greetings.GreetingService;
import greetings.GreetingServiceImpl;

public class StaticFactoryBean {
    public static GreetingService createInstance() {
        return new GreetingServiceImpl();
    }

    public static GreetingService createInstance(String message) {
        return new GreetingServiceImpl("Static Parametrized Factory " + message);
    }
}
