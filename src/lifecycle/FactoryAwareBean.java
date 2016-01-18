package lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class FactoryAwareBean implements BeanFactoryAware  {
    private BeanFactory factory;
    
    public void setBeanFactory(BeanFactory factory) throws BeansException {
        this.factory = factory;
    }
    
    @Override
    public String toString() {
        return "My factory is " + factory;
    }    
}
