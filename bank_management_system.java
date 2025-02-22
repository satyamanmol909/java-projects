import java.util.Scanner;
public class bank_management_system {
    static Scanner var1=new Scanner(System.in);
    static String name;
    static double account_balance,account_no;
    static double withdraw,deposit,check_balance;
    static void input_data()
    {
        System.out.print("enter the name:");
        name=var1.nextLine();
        System.out.print("enter the account number:");
        account_no=var1.nextDouble();
        System.out.print("enter the ammount of the account:");
        account_balance=var1.nextDouble();
    }
    static void display_account()
    {
        System.out.println("NAME: "+name);
        System.out.println("ACCOUNT NUMBER: "+account_no);
        System.out.println("CURRENT BALANCE: "+account_balance);
    }
    static void deposit()
    {
        System.out.print("enter the ammount to deposit:");
        deposit=var1.nextDouble();
        account_balance=account_balance+deposit;
        System.out.println("deposit succcessful: check the balance");
    }
    static void withdraw()
    {
        System.out.print("enter the ammount to withdraw:");
        withdraw=var1.nextDouble();
        if(account_balance>=withdraw)
        {
            System.out.println("withdraw successful");
            account_balance=account_balance-withdraw;
        }
        else
        {
           System.out.println("no proper ammount:\n check the balence first:"); 
        }
    }
   
    public static void main(String[] args) 
    {   
        System.out.println("\n____________Bank Management System___________");
        input_data();
        while(true)
        {
           
            System.out.println("1. Display Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.print("Enter your choice: ");
            int choice = var1.nextInt();
            System.out.println();
            switch(choice)
            {
                case 1:
                    display_account();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;

            }
            int n;
            System.out.println();
            System.out.print("\tif you don't want to use again press '4'\n \t otherwise press any numeric key");
            n=var1.nextInt();
            if(n==4)
            {
                System.out.println();
                System.out.println("\tTHANKS");
                break;
            }
            
            
        }
    }
    
}
