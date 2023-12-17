import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();

        int studentID = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter student ID:");
                studentID = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for student ID.");
                scanner.nextLine();
                }
            }
        scanner.nextLine();

        System.out.println("Enter courses to enroll in (separated by commas):");
        String coursesInput = scanner.nextLine();
        String[] inputCourses = coursesInput.split(",");

        Student student = new Student(studentName, studentID);

        for (String course : inputCourses) {
            student.enrollInCourse(course.trim());
        }
        String[][] courses = {
            {"101", "Pemrograman Berbasis Objek", "Haris", "Metta"},
            {"102", "Statistika Industri", "Windy", "Amilia"}
        };
        for (String[] course : courses) {
            System.out.println("\nCourse ID: " + course[0]);
            System.out.println("Course Name: " + course[1]);
            for (int i = 2; i < course.length; i++) {
                System.out.println("- Student: " + course[i]);
            }
        }

        System.out.println("\n" + student.getUserDetails());

        Teacher teacher = new Teacher("Pak Yoga Raditya", 12345);
        teacher.teachClass("Pemodelan Proses Bisnis");

        Admin admin = new Admin("Hudza", 54321);
        admin.manageSystem("the university system");

        scanner.close();
    }
}
