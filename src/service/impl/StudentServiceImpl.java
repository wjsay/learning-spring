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

import java.sql.SQLException;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {
    @Autowired   // 通过类型注入，若有多个同类型的bean，报错，空指针异常
    @Qualifier("StudentDaoImpl")
    IStudentDao studentDao;


    @Transactional(readOnly = false, propagation = Propagation.REQUIRED,
        rollbackFor = {SQLException.class, ArithmeticException.class})
    @Override
    public void addStudent(Student student) {
        // studentDao = null;  // 测试异常通知时添加的
        studentDao.addStudent(student);
    }

    @Override
    public void deleteStudentByNo(int no) {
        studentDao.deleteStudentByNo(no);
    }
}
