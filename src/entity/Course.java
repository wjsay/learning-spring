package entity;

public class Course {
    private String courseName;
    private int courseHoue;
    private Teacher teacher;

    public String getCourseName() {
        return courseName;
    }

    public int getCourseHoue() {
        return courseHoue;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseHoue(int courseHoue) {
        this.courseHoue = courseHoue;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void showInfo() {
        System.out.println("[Course: " + this.courseName + ", "
                + this.courseHoue + ", " + this.teacher.getName() + "]");
    }

    public Course() {
    }

    public Course(String courseName, int courseHoue, Teacher teacher) {
        this.courseName = courseName;
        this.courseHoue = courseHoue;
        this.teacher = teacher;
    }
}
