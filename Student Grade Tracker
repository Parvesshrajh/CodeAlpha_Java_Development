import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Welcome to the Student Grade Tracker!");
        
        // Input grades
        while (true) {
            System.out.print("Enter a student's grade (or -1 to finish): ");
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            }
            if (grade >= 0 && grade <= 100) {
                grades.add(grade);
            } else {
                System.out.println("Invalid grade. Please enter a value between 0 and 100.");
            }
        }

        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
        } else {
            // Compute average, highest, and lowest grades
            int total = 0;
            int highest = Integer.MIN_VALUE;
            int lowest = Integer.MAX_VALUE;

            for (int grade : grades) {
                total += grade;
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }

            double average = (double) total / grades.size();

            // Display results
            System.out.println("\nGrade Summary:");
            System.out.println("---------------");
            System.out.println("Grades entered: " + grades);
            System.out.println("Average grade: " + average);
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
        }

        scanner.close();
    }
}
