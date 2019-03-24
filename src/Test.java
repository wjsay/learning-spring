import entity.Student;
import factory.CourseFactory;
import newinstance.ICourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

    public static void learnIOC() {
        //Student student = new Student(1, "zs", 20);
        //System.out.println(student.toString());
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student)context.getBean("student");
        //System.out.println(student.toString());

    }

    public static void learnCourse() {
        Student student = new Student();
        student.learnJava();
        student.learnHTML();
    }

    public static void learnCourseWithFactory () {
        Student student = new Student();
        student.learn("j");
    }

    public static void learnCourseWithIoc() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        student.learn("HTML");
    }

    public static void main(String[] args) {
        learnCourseWithIoc();
    }
}
