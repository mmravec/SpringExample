package aop5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop5/beans.xml");

        Student student = new Student("Janko", "Hrasko");
        StudentEnrollmentService studentEnrollmentService = (StudentEnrollmentService) context.getBean("studentEnrollmentService");
        studentEnrollmentService.enroll(student);

        StudentExamService studentExamService = (StudentExamService) context.getBean("studentExamService");
        studentExamService.takeExam(student);
    }
}
