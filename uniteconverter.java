import java.util.Scanner;

public class uniteconverter {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n----- Unit Converter -----");
            System.out.println("1. Length Converter");
            System.out.println("2. Weight Converter");
            System.out.println("3. Temperature Converter");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    convertLength();
                    break;
                case 2:
                    convertWeight();
                    break;
                case 3:
                    convertTemperature();
                    break;
                case 4:
                    System.out.println("Thank you for using the Unit Converter!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
        sc.close();
    }

    // Length Conversion
    public static void convertLength() {
        System.out.println("\n--- Length Converter ---");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.println("3. Inches to Centimeters");
        System.out.println("4. Centimeters to Inches");
        System.out.print("Choose conversion: ");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.print("Enter meters: ");
                double meters = sc.nextDouble();
                System.out.println("Result: " + (meters / 1000) + " kilometers");
                break;
            case 2:
                System.out.print("Enter kilometers: ");
                double km = sc.nextDouble();
                System.out.println("Result: " + (km * 1000) + " meters");
                break;
            case 3:
                System.out.print("Enter inches: ");
                double inches = sc.nextDouble();
                System.out.println("Result: " + (inches * 2.54) + " centimeters");
                break;
            case 4:
                System.out.print("Enter centimeters: ");
                double cm = sc.nextDouble();
                System.out.println("Result: " + (cm / 2.54) + " inches");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    // Weight Conversion
    public static void convertWeight() {
        System.out.println("\n--- Weight Converter ---");
        System.out.println("1. Kilograms to Grams");
        System.out.println("2. Grams to Kilograms");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.print("Choose conversion: ");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.print("Enter kilograms: ");
                double kg = sc.nextDouble();
                System.out.println("Result: " + (kg * 1000) + " grams");
                break;
            case 2:
                System.out.print("Enter grams: ");
                double g = sc.nextDouble();
                System.out.println("Result: " + (g / 1000) + " kilograms");
                break;
            case 3:
                System.out.print("Enter pounds: ");
                double pounds = sc.nextDouble();
                System.out.println("Result: " + (pounds * 0.453592) + " kilograms");
                break;
            case 4:
                System.out.print("Enter kilograms: ");
                double kilo = sc.nextDouble();
                System.out.println("Result: " + (kilo / 0.453592) + " pounds");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    // Temperature Conversion
    public static void convertTemperature() {
        System.out.println("\n--- Temperature Converter ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose conversion: ");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.print("Enter Celsius: ");
                double c = sc.nextDouble();
                System.out.println("Result: " + ((c * 9 / 5) + 32) + " Fahrenheit");
                break;
            case 2:
                System.out.print("Enter Fahrenheit: ");
                double f = sc.nextDouble();
                System.out.println("Result: " + ((f - 32) * 5 / 9) + " Celsius");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
