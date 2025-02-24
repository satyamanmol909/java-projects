
public class TrafficManagementSystem {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\tWELCOME");
        System.out.println("_________________________________________");
        while (true) {
            
            for (int red = 15; red >= 0; red--) {
                System.out.print("\033[F\033[K");
                System.out.print("\tRed Light\n"+"Wait for " + red + " second ");
                Thread.sleep(1000);
                
            }
            

            
            for (int yellow = 10; yellow >= 0; yellow--) {
                System.out.print("\033[F\033[K");
                System.out.print("\tYellow Light\n"+"Yellow in " + yellow + " second ");
                Thread.sleep(1000);
                
            }
            

        
            for (int green = 15; green >= 0; green--) {
                System.out.print("\033[F\033[K");
                System.out.print("\tGreen Light\n"+"Go for " + green + " second ");
                Thread.sleep(1000);
                
            }
            System.out.println();
        }
    }
}

