import java.util.Scanner;

public class timer {
    public static void main(String[] args) throws InterruptedException {
        Scanner var1 = new Scanner(System.in);

        System.out.print("Enter the hour: ");
        int h = var1.nextInt();
        System.out.print("Enter the minutes: ");
        int m = var1.nextInt();
        System.out.print("Enter the seconds: ");
        int s = var1.nextInt();


        while (h > 0 || m > 0 || s > 0) {
           
            System.out.println("\t\t" + h + ":" + m + ":" + s);

            Thread.sleep(1000);
            s--;

            if (s < 0) {
                s = 59;
                m--;
            }

            if (m < 0) {
                m = 59;
                h--;
            }

            if (h < 0) {
                h = 0;
            }
            System.out.print("\033[F\033[K");
        }

        System.out.print("\033[F\033[K");
        System.out.println("\t\tTimer ended!");
        System.out.println("----------------------------------------------------------------");

        var1.close();
    }
}

