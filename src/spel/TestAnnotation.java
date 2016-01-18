package spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    public static void main(String[] args) throws Exception {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("spel/beans-ann.xml");

        GuessNumber gn = context.getBean(GuessNumber.class);
        System.out.println(gn.getValue());
    }
}
