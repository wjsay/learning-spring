import dao.impl.StudentDaoImpl;
import entity.AllCollection;
import entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import entity.Course;
import service.IStudentService;
import service.impl.StudentServiceImpl;


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
        student.learn("java");
    }

    public static void learnCourseWithIoc() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        student.learn("HTML");
    }

    // set注入
    public static void learnCourseWithDI() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Course course = (Course)context.getBean("course");
        course.showInfo();
    }

    public static void learnDIWithCollection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AllCollection collections = (AllCollection)context.getBean("collections");
        System.out.println(collections.showInfo());
    }

    public static void learnTransaction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService studentService = (IStudentService) context.getBean("studentService");
        studentService.addStudent(new Student());
        studentService.deleteStudentByNo(1);
    }
    public static void learnAop() {
        // NoClassDefFoundError 意味着缺少jar包
        learnTransaction();
    }
    public static void main(String[] args) {
        //learnCourseWithIoc();
        //learnCourseWithDI();
        //learnDIWithCollection();
        learnTransaction();
        //learnAop();
    }
}
