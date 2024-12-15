import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeManager {
    // HashMap to store student names and grades
    private HashMap<String, Integer> studentGrades;

    // Constructor to initialize the HashMap
    public StudentGradeManager() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student added: " + name + " with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // Method to display a student's grade
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println("Grade of " + name + ": " + studentGrades.get(name));
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // Main method for user interaction
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGradeManager manager = new StudentGradeManager();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student's Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    manager.addStudent(nameToAdd, grade);
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    manager.removeStudent(nameToRemove);
                    break;

                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String nameToDisplay = scanner.nextLine();
                    manager.displayGrade(nameToDisplay);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
