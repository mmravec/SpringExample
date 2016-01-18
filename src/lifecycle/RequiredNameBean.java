package lifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class RequiredNameBean implements InitializingBean, BeanNameAware {
    private String name;

    private String beanName;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void afterPropertiesSet() throws Exception {
        if(name == null) {
            throw new IllegalStateException("Property 'name' is required for bean '" + beanName + "'");
        }
    }

    public void setBeanName(String beanName) {
       this.beanName = beanName;
    }
}
