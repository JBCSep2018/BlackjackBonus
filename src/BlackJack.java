import java.util.Scanner;

public class BlackJack {
  public static void main(String args[]) {
     Original();
  }

  protected static void Original(){
    // Think about what variables and their types are needed, declare them first
    int num1 = 0, num2 = 0, sum = 0;

    // New instance of the Scanner object
    Scanner in = new Scanner(System.in);

    // Welcome message
    System.out.println("Hello, let's play some BlackJack!");

    do {
      // Prompt the user for first number
      System.out.printf("Enter your first number: ");

      // Read in user input as an integer and store its value in num1 variable
      num1 = in.nextInt();

      // Prompt the user for second number
      System.out.printf("Enter your second number: ");

      // Read in second number as integer and store its value in num2 variable
      num2 = in.nextInt();

      sum = num1 + num2; // Calculate the sum of the two numbers

      // Call the printSum() method to print out the sum, pass the sum value
      // to the method as a parameter (see below)
      printSum(sum);
    } while(sum != 21 && sum != 0);

    System.out.println("It was a nice game, goodbye.");

  }

  // int sum is the value of the sum passed in from main above
  private static void printSum(int sum) {
    switch(sum) {
      case 21:
        // If sum = 21, print the sum with an asterisk *
        System.out.println("Sum: *" + sum);
        // Break statement prevents fall through (all conditions after matching case are executed)
        break;
      // If sum=0, print sum only
      case 0:
        System.out.println("Sum: " + sum);
        break;
      // All other conditions, print the sum and ask the user to try again
      default:
        System.out.println("Sum: " + sum + ", try again.");
    }
  }

}
