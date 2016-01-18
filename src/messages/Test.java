package messages;

import java.util.Locale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("messages/beans.xml");

        System.out.println(Locale.getDefault());
        Locale slovak = new Locale("sk");
        System.out.println(context.getMessage("msg", null, null));
        System.out.println(context.getMessage("msg", null, slovak));

        System.out.println(context.getMessage("nameMsg", new Object[]{"Rob",
            "Harrop"
        }, null));
        
        Object o = context.getBean("messagePrintingBean");
        System.out.println("Printing message: " + o);
    }
}
