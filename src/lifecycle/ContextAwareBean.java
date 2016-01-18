package lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextAwareBean implements ApplicationContextAware  {
    private ApplicationContext context;
    
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }
    
    @Override
    public String toString() {
        return "My context is " + context;
    }
}
