package lifecycle;

import org.springframework.beans.factory.BeanNameAware;

public class NameAwareBean implements BeanNameAware {
    private String name;
    
    public void setBeanName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "My name is " + name;
    }
}
