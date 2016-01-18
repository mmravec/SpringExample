package instantiate;

import greetings.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("instantiate/beans.xml");

        GreetingService greeting = (GreetingService) context.getBean("greetingService1");
        greeting.sayGreeting();
        
        greeting = (GreetingService) context.getBean("greetingService2");
        greeting.sayGreeting();

        greeting = (GreetingService) context.getBean("greetingService3");
        greeting.sayGreeting();
    }
}
