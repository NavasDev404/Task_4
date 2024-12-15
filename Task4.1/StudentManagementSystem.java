// Main class to test the Student Management System
public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
            // Valid student
            Student student1 = new Student(101, "John Doe", 18, "Computer Science");
            System.out.println(student1);

            // Student with invalid age
            Student student2 = new Student(102, "Jane Smith", 22, "Mathematics");
            System.out.println(student2);

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Student with invalid name
            Student student3 = new Student(103, "An4thony@", 20, "Physics");
            System.out.println(student3);

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}