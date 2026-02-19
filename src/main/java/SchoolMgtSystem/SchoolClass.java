package SchoolMgtSystem;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {

    private String className;

    // Composition class that contains student
    private List<Student> students = new ArrayList<>();

    public SchoolClass(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void displayStudents(){
        System.out.println("Students in " + className + ": ");
        for (Student s : students){
            System.out.println(s.getName() + "| ID: " + s.getId());
        }
    }
}
