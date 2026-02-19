package SchoolMgtSystem;

public class Teacher extends Staff {
    public Teacher(String name, int age, int id) {
        super(name, age, id);
    }

    // Relationship of Teacher teaching course
    public void teachCourse(Course course){
        System.out.println(getName() + "is teaching " + course.getCourseName());
    }
}
