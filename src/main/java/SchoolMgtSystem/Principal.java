package SchoolMgtSystem;

import java.util.List;

public class Principal extends Staff {

    public Principal(String name, int age, int id) {
        super(name, age, id);
    }

    //Principal admits a student based on age limit
    public Student admitStudent(Applicant applicant){

        if (applicant.getAge() >= 16){
            System.out.println("Applicant admitted successfully!");
            return new Student(
                    applicant.getName(),
                    applicant.getAge(),
                    applicant.getId()
            );
        } else{
            System.out.println("Applicant too young. Application denied");
            return  null;
        }
    }

    // Principal expel student
    public void expelStudent(Student student, List<Student> students){
        students.remove(student);
        System.out.println(student.getName() + "has been expelled.");
    }
}
