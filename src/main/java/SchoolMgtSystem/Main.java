package SchoolMgtSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
            

        } while (choice != 9);
        scanner.close();

    }
}
