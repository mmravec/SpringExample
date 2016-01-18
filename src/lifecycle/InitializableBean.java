package lifecycle;

import org.springframework.beans.factory.InitializingBean;

public class InitializableBean implements InitializingBean {
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializableBean afterPropertiesSet");
    }
}
