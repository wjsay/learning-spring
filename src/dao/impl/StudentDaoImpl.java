package dao.impl;

import dao.IStudentDao;
import entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// 相当于 <bean id="studentDao" class="dao.impl.StudentDaoImpl"></bean>
//@Component
@Repository("StudentDaoImpl")  // @Service @Controller
public class StudentDaoImpl implements IStudentDao {
    @Override
    public void addStudent(Student student) {
        System.out.println("添加一个学生...");
    }

    @Override
    public void deleteStudentByNo(int no) {
        System.out.println("删除一个学生，学号为：" + no);
    }
}
