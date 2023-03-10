package ATM;
import java.util.*;

public class AtmMachine {
    public static void main(String[]args){

        int pin=8378;
        int balance= 10000;

        int AddAmount=0;
        int TakeAmount=0;

        String name;

        Scanner sc= new Scanner(System.in);

        //we have to take an input by an user
        System.out.println("Enter your pin number: ");

        int password = scanner.nextint();

        if (password==pin){
            System.out.println("Enter your name: ");
            name= scanner.next();
            System.out.println("Welcome " + name);

            while (true){
                System.out.println("press 1 to check your balance");
                System.out.println("press 2 to add amount");
                System.out.println("press 3 to take amount");
                System.out.println("press 4 to take receipt");
                System.out.println("press 5 to exit");

                int opt= scanner.nextint();
                switch(opt) {

                    case 1:
                        System.out.println("your current balance is " + balance);
                        break;
                    case 2:
                        System.out.println("How much amount did your want to ADD to your amount");
                        AddAmount = scanner.nextint();
                        System.out.println("Successfully credited");
                        balance = AddAmount + balance;
                        break;
                    case 3:
                        System.out.println("How much amount did you want to take");
                        TakeAmount = scanner.nextint();
                        if (TakeAmount > balance) {
                            System.out.println("Your balnce is insufficient");
                            System.out.println("Try less than your available balance");
                        }
                        break;
                    case 4:
                        System.out.println("Welcome to All in one mini ATM");
                        System.out.println("Available balance is " + balance);
                        System.out.println("Amount deposited " + AddAmount);
                        System.out.println("Amount taken    " = TakeAmount);
                        System.out.println("Thanks for coming");
                        break;
                    default:
                        System.out.println("press the number below 5");
                        break;
                }
                if (opt==5) {
                    System.out.println("Thank You!");
                    break;
                }

            }

        }
        else {
            System.out.println("Wrong Pin Number");
        }

    }
}