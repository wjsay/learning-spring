package factory;

import newinstance.HTMLCourse;
import newinstance.ICourse;
import newinstance.JavaCourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseFactory {
    public static ICourse getCourse(String name) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        if (name.equals("java")) {
            //return new JavaCourse();
            return (ICourse)context.getBean("JavaCourse");
        }
        else if (name.equals("HTML")) {
            //return new HTMLCourse();
            return (ICourse)context.getBean("HTMLCourse");
        }
        return null;
    }
}
