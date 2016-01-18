package greetings;

public class GreetingServiceOtherImpl implements GreetingService {
    private String greeting;

    public GreetingServiceOtherImpl() {
    }

    public GreetingServiceOtherImpl(String greeting) {
        this.greeting = greeting;
    }

    public void sayGreeting() {
        System.err.println(greeting);
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
