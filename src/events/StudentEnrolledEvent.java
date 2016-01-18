package events;

import messages.*;
import org.springframework.context.ApplicationEvent;

public class StudentEnrolledEvent extends ApplicationEvent {
    private final Student student;

    public StudentEnrolledEvent(Object source, Student student) {
        super(source);
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}
