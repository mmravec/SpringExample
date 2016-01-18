package greetings;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class GreetingApp {
    public static void main(String[] args) throws Exception {
        BeanFactory factory =
                new XmlBeanFactory(new ClassPathResource("greetings/hello.xml"));
        GreetingService greetingService =
                (GreetingService) factory.getBean("greetingService");
        greetingService.sayGreeting();
    }
}
