import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        double random_number = Math.random();
        int random=(int)(random_number*100);

        
        System.out.println("Guess the number between 1 and 100!");
        System.out.println("enter the times to guess the number");
        int count =var1.nextInt();
        int attempts = 0;
        int guess=1;

        while (guess!=random) {
            
            if(count==0)
            {
                System.out.println("defeat");
                break;
            }
           
            System.out.print("Enter your guess: ");
            guess = var1.nextInt();
            attempts++;

            if (guess < random) {
                System.out.println("Too low! Try again.");
            } else if (guess > random) {
                System.out.println("Too high! Try again.");
            } else 
            {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            }
            count--;
            
        }

        var1.close();
    }
}

