package property;

import greetings.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        //Application context for property placeholder is required
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("property/hello-prop.xml");
        GreetingService greetingService =
                (GreetingService) context.getBean("greetingService");
        greetingService.sayGreeting();
    }
}
