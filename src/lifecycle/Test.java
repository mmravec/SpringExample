package lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("lifecycle/beans.xml");

        //Need to be registered in non web applications
        context.registerShutdownHook();

        Object bean;

        bean = context.getBean("nameAwareBean");
        System.out.println(bean);

        bean = context.getBean("factoryAwareBean");
        System.out.println(bean);

        bean = context.getBean("contextAwareBean");
        System.out.println(bean);

        bean = context.getBean("initDestroyBean");
        System.out.println(bean);
    }
}
