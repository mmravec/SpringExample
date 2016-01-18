package inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("inheritance/beans.xml");

        Object o = context.getBean("someBean");
        System.out.println(o);
        
        o = context.getBean("anotherBean");
        System.out.println(o);
    }
}
