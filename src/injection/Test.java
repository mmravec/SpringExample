package injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("injection/beans.xml");

        Object o = context.getBean("injectingSimpleBean");
        System.out.println(o);
        
        o = context.getBean("injectingRefBean");
        System.out.println(o);
        
        o = context.getBean("constructorInjection");
        System.out.println(o);
    }
}
