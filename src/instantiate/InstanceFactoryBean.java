package instantiate;

import greetings.GreetingService;
import greetings.GreetingServiceImpl;

public class InstanceFactoryBean {
    public GreetingService createInstance() {
        return new GreetingServiceImpl();
    }

    public GreetingService createInstance(String message) {
        return new GreetingServiceImpl("Instance Parametrized Factory " + message);
    }
}
