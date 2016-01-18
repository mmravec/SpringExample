package events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EnrollmentListener implements ApplicationListener  {

    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof StudentEnrolledEvent) {
            Student student = ((StudentEnrolledEvent)event).getStudent();
            System.out.println("Student " + student + " ennroled.");
        }
    }
}
