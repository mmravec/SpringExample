package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop/beans.xml");

        Performer performer = (Performer) context.getBean("performer");
        performer.perform();
    }
}
