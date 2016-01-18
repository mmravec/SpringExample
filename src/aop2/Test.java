package aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.Performer;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop2/beans.xml");

        Performer performer = (Performer) context.getBean("performer");
        performer.perform();
    }
}
