package events;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("events/beans.xml");

        StudentEnroller se = (StudentEnroller) context.getBean("studentEnroller");
        se.enrollStudent(new Student("James", "Bond"));
    }
}
