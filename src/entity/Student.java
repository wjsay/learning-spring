package entity;

import factory.CourseFactory;
import newinstance.HTMLCourse;
import newinstance.ICourse;
import newinstance.JavaCourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
    private int stuNo;
    private String stuName;
    private int stuAge;

    public int getStuNo() {
        return stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public Student(int stuNo, String stuName, int stuAge) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return stuNo + "-" + stuName + "-" + stuAge;
    }

    public void learnJava() {
        ICourse course = new JavaCourse();
        course.learn();
    }

    public void learnHTML() {
        ICourse course = new HTMLCourse();
        course.learn();
    }

    public void learn(String name) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ICourse course = null;
        if (name.equals("java")) {
            course = (ICourse) context.getBean("JavaCourse");
        }
        else if (name.equals("HTML")){
            course = (ICourse) context.getBean("HTMLCourse");
        }
        //ICourse course = CourseFactory.getCourse(name);
        if (course != null) {
            course.learn();
        }
    }
}
