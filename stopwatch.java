import java.io.IOException;
import java.util.Scanner;

public class stopwatch {
    public static void main(String[] args) throws InterruptedException,IOException {
        Scanner var1 = new Scanner(System.in);
        int H = 0, M = 0, S = 0;
        System.out.println("\t\tSTOPWATCH");
        System.out.println("\t\tH:M:S");
        System.out.println();

        System.out.print("Enter 5 to start or 0 to stop: ");
        int n = var1.nextInt();
        System.out.print("\033[F\033[K");

        while (n == 5) {
            S++;
            if (S >= 60) {
                S = 0;
                M++;
            }
            if (M >= 60) {
                M = 0;
                H++;
            }

            System.out.print("\033[F\033[K");
            System.out.println("\t\t" + H + ":" + M + ":" + S);
            
            Thread.sleep(1000);

            if (System.in.available() > 0) {
                System.out.print("Enter 0 to stop: ");
                n = var1.nextInt();
                System.out.print("\033[F\033[K");
            }
            
        }

        System.out.println("Stopwatch stopped.");
        var1.close();
    }
}