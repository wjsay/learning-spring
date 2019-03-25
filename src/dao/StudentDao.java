package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository  // @Service @Controller
public class StudentDao {
    public static void addStudent() {
        System.out.println("添加一个学生...");
    }
}
