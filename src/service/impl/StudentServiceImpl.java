package service.impl;

import dao.IStudentDao;
import dao.impl.StudentDaoImpl;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.IStudentService;

@Component("studentService")
public class StudentServiceImpl implements IStudentService {
    @Autowired   // 通过类型注入，若有多个同类型的bean，报错，空指针异常
    StudentDaoImpl studentDao;


    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @Override
    public void addStudent(Student student) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        studentDao = (StudentDaoImpl) context.getBean("StudentDaoImpl");
        studentDao.addStudent(student);
    }
}
