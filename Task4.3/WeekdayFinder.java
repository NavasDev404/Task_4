import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        // Array of weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user for the day position
            System.out.print("Enter the day position (0-6): ");
            int dayIndex = scanner.nextInt();

            // Print the day name corresponding to the position
            System.out.println("The day is: " + weekdays[dayIndex]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid day index. Please enter a number between 0 and 6.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a numeric value.");
        } finally {
            scanner.close();
        }
    }
}
