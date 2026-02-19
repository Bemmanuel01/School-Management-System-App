package SchoolMgtSystem;

import java.util.List;
import java.util.ArrayList;

public class Student extends Person {

    // Aggregation: Student has courses
    private List<Course> courses = new ArrayList<>();

    public Student(String name, int age, int id) {
        super(name, age, id);
    }

    // Student can take a course
    public void takeCourse(Course course){
        course.add(course);
        System.out.println(getName() + "is now taking " + course.getCourseName());
    }

    public void displayCourse(){
        System.out.println("Courses for " + getName() + ":");

        for(Course c: courses){
            System.out.println("- " + c.getCourseName());
        }
    }

}
