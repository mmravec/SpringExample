package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("autowire/beans.xml");

        Target t;        
        t = (Target) context.getBean("targetByName");
        System.out.println("targetByName " + t);
        
        t = (Target) context.getBean("targetByType");
        System.out.println("targetByType " + t);
        
        t = (Target) context.getBean("targetConstructor");
        System.out.println("targetConstructor " + t);
        
        t = (Target) context.getBean("targetAutodetect");        
        System.out.println("targetAutodetect " + t);
    }
}
