package SchoolMgtSystem;

// Non-Academic staff handles all admin's duties

public class NonAcademicStaff extends Staff {

    public NonAcademicStaff(String name, int age, int id) {
        super(name, age, id);
    }

    // Non-academic staff assign's student to their class
    public void assignStudentToClass(Student student, SchoolClass schoolClass){
        schoolClass.addStudent(student);
        System.out.println(student.getName() + "assigned to " + schoolClass.getClassName());
    }

    // Non-academic staff makes announcement
    public void makeAnnouncement(String message){
        System.out.println("Announcement by " + getName() + ": " + message);
    }
}
