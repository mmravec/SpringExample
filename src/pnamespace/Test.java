package pnamespace;

import greetings.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("pnamespace/hello.xml");
        GreetingService greetingService =
                (GreetingService) context.getBean("greetingService");
        greetingService.sayGreeting();
    }
}
