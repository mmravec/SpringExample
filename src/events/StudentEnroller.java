package events;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class StudentEnroller implements ApplicationContextAware  {
    private ApplicationContext context;
    
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }
    
    public void enrollStudent(Student student) {
        //Do something
        context.publishEvent(new StudentEnrolledEvent(this, student));
    }
}
