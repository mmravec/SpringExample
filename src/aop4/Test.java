package aop4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.Performer;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop4/beans.xml");

        Performer performer = (Performer) context.getBean("performer");
        performer.perform();

        performer = (Performer) context.getBean("otherPerformer");
        performer.perform();
    }
}
