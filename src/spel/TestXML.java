package spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXML {
    public static void main(String[] args) throws Exception {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("spel/beans.xml");

        Person person = context.getBean("person", Person.class);
        System.out.println(person.getName());

        person = context.getBean("person2", Person.class);
        System.out.println(person.getName());    
    }
}
