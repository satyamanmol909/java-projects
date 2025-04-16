import java.util.Scanner;

public class weather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days;
        System.out.print("Enter number of days to forecast: ");
        days = sc.nextInt();

        double[] temperature = new double[days];
        int[] humidity = new int[days];
        String[] condition = new String[days];

        for (int i = 0; i < days; i++) {
            System.out.println("\nDay " + (i + 1) + " Weather Details:");
            System.out.print("Enter temperature (°C): ");
            temperature[i] = sc.nextDouble();

            System.out.print("Enter humidity (%): ");
            humidity[i] = sc.nextInt();

            sc.nextLine();
            System.out.print("Enter weather condition (Sunny, Rainy, Cloudy, etc.): ");
            condition[i] = sc.nextLine();
        }

        System.out.print("enter the day to know the weather:");
        int n = sc.nextInt();
        int i = n - 1;

        System.out.println("\n----- Weather Forecast -----");

        System.out.println("Day " + (i + 1) + ": ");
        System.out.println("Temperature: " + temperature[i] + "°C");
        System.out.println("Humidity: " + humidity[i] + "%");
        System.out.println("Condition: " + condition[i]);
        System.out.println("---------------------------");

        sc.close();
    }
}
