import java.util.Scanner;

// Main class
public class VoterRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input voter details
            System.out.print("Enter voter ID: ");
            int voterId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter voter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter voter age: ");
            int age = scanner.nextInt();

            // Create Voter object
            Voter voter = new Voter(voterId, name, age);
            System.out.println("Voter registered successfully: " + voter);

        } catch (InvalidVoterAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
        } finally {
            scanner.close();
        }
    }
}