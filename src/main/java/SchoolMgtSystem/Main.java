package SchoolMgtSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Principal principal = new Principal("Mr Benjamine", 42, 1);
        Teacher teacher = new Teacher("Mr Manuel", 42, 2);

        List<Student> students = new ArrayList<>();

        int choice = 0;

        do{
            System.out.println("\n=== SCHOOL MANAGEMENT SYSTEM ===");
            System.out.println("1. Apply for Admission");
            System.out.println("2. View Students");
            System.out.println("3. Expel Student");
            System.out.println("4. Teach Course");
            System.out.println("5. Student Take Course");
            System.out.println("6. Assign Student to Class");
            System.out.println("7. View Class Students");
            System.out.println("8. Make Announcement");
            System.out.println("9. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Name: ");
                    String name = scanner.nextLine();

                    System.out.println("Age: ");
                    int age = scanner.nextInt();

                    System.out.println("Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    Applicant applicant = new Applicant(name, age, id);
                    Student admitted = principal.admitStudent(applicant);

                    if (admitted != null){
                        students.add(admitted);
                    }
                    break;

                case 2:
                    for (Student s : students) {
                        System.out.println(s.getName() + " | ID: " + s.getId());
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to expel: ");
                    int expelId = scanner.nextInt();
                    scanner.nextLine();

                    Student toRemove = null;

                    for (Student s : students) {
                        if (s.getId() == expelId) {
                            toRemove = s;
                            break;
                        }
                    }

                    if (toRemove != null) {
                        principal.expelStudent(toRemove, students);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Course Name: ");
                    String teachCourse = scanner.nextLine();
                    teacher.teachCourse(new Course(teachCourse));
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();

                    for (Student s : students) {
                        if (s.getId() == studentId) {
                            s.takeCourse(new Course(courseName));
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter Student ID: ");
                    int assignId = scanner.nextInt();
                    scanner.nextLine();

                    for (Student s : students) {
                        if (s.getId() == assignId) {
                            admin.assignStudentToClass(s, primaryOne);
                        }
                    }
                    break;
            }

        } while (choice != 9);
        scanner.close();

    }
}
