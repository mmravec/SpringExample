package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("annotation/beans.xml");

        MyComponent mc = context.getBean(MyComponent.class);
        System.out.println(mc.getOtherComponent());
    }
}
