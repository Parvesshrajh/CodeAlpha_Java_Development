import java.util.ArrayList;
import java.util.Scanner;

class Destination {
    String name;
    String startDate;
    String endDate;
    double budget;

    public Destination(String name, String startDate, String endDate, double budget) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Destination: " + name + ", Start Date: " + startDate + ", End Date: " + endDate + ", Budget: $" + budget;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Destination> itinerary = new ArrayList<>();
        boolean exit = false;

        System.out.println("Welcome to the Travel Itinerary Planner!");

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a Destination");
            System.out.println("2. View Itinerary");
            System.out.println("3. Calculate Total Budget");
            System.out.println("4. Weather Information (Placeholder)");
            System.out.println("5. Map Information (Placeholder)");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addDestination(scanner, itinerary);
                    break;
                case 2:
                    viewItinerary(itinerary);
                    break;
                case 3:
                    calculateTotalBudget(itinerary);
                    break;
                case 4:
                    weatherInfo();
                    break;
                case 5:
                    mapInfo();
                    break;
                case 6:
                    System.out.println("Thank you for using the Travel Itinerary Planner. Safe travels!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Method to add a destination to the itinerary
    private static void addDestination(Scanner scanner, ArrayList<Destination> itinerary) {
        System.out.print("Enter destination name: ");
        String name = scanner.nextLine();
        System.out.print("Enter start date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();
        System.out.print("Enter end date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();
        System.out.print("Enter budget for this destination: ");
        double budget = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Destination destination = new Destination(name, startDate, endDate, budget);
        itinerary.add(destination);
        System.out.println("Destination added successfully!");
    }

    // Method to view the itinerary
    private static void viewItinerary(ArrayList<Destination> itinerary) {
        if (itinerary.isEmpty()) {
            System.out.println("Your itinerary is empty.");
        } else {
            System.out.println("\nYour Itinerary:");
            for (Destination destination : itinerary) {
                System.out.println(destination);
            }
        }
    }

    // Method to calculate the total budget
    private static void calculateTotalBudget(ArrayList<Destination> itinerary) {
        double totalBudget = 0;
        for (Destination destination : itinerary) {
            totalBudget += destination.budget;
        }
        System.out.printf("Total Budget for the trip: $%.2f%n", totalBudget);
    }

    // Placeholder for weather information
    private static void weatherInfo() {
        System.out.println("Weather Information: This feature is under development.");
    }

    // Placeholder for map information
    private static void mapInfo() {
        System.out.println("Map Information: This feature is under development.");
    }
  }
