import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class BlackJack {
  public static void main(String args[]) {
     Original();
//     Bonus();
//     Bonus2();
  }

  protected static void Original(){
    // Think about what variables and their types are needed, declare them first
    int num1 = 0, num2 = 0, sum = 0;
    Scanner in = new Scanner(System.in); // New instance of the Scanner object

    System.out.println("Hello, let's play some BlackJack!"); // Welcome message
    System.out.printf("Enter your first number: "); // Prompt the user for first number
    num1 = in.nextInt();  // Read in user input as an integer and store its value in num1 variable

    System.out.printf("Enter your second number: "); // Prompt the user for second number
    num2 = in.nextInt(); // Read in second number as integer and store its value in num2 variable

    sum = num1 + num2; // Calculate the sum of the two numbers

    printSum(sum); // Call the printSum() method to print out the sum, pass the sum value to the method as a parameter (see below)

    System.out.println("It was a nice game, goodbye.");
  }

  protected static void Bonus(){
    String card1, card2;
    int num1 = 0, num2 = 0, sum = 0;
    Scanner in = new Scanner(System.in);

    System.out.println("Hello, let's play some BlackJack!");
    System.out.printf("Enter your first card: ");
    card1 = in.next();
    num1 = getCardValue(card1.toUpperCase());

    System.out.printf("Enter you second card: ");
    card2 = in.next();
    num2 = getCardValue(card2.toUpperCase());

    sum = num1 + num2;

    printSum(sum);

    System.out.println("It was a nice game, goodbye.");
  }

  protected static void Bonus2(){
    String card1, card2;
    int num1 = 0, num2 = 0, sum = 0;
    Scanner in = new Scanner(System.in);

    System.out.println("Hello, let's play some BlackJack!");
    System.out.printf("Enter your first card: ");
    card1 = in.next();
    num1 = getCardValue2(card1.toUpperCase());

    System.out.printf("Enter you second card: ");
    card2 = in.next();
    num2 = getCardValue2(card2.toUpperCase());

    sum = num1 + num2;

    printSum(sum);

    System.out.println("It was a nice game, goodbye.");
  }

  private static void printSum(int sum) { // int sum is the value of the sum passed in from main above
    switch(sum) { // switch statement used to compare the sum
      case 21: // if sum = 21
        System.out.println("Sum: *" + sum); // Print the sum with an asterisk *
        break;  // break statement prevents fall through (all conditions after matching case are executed)
      case 0: // if case is zero, program terminates
        break;
      default:
        System.out.println("Sum: " + sum); // by default, the sum is printed
    }
  }

  private static int getCardValue(String card) {
    if(card.equals("J") || card.equals("Q") || card.equals("K")){
      return 10;
    }
    else if(card.equals("A")){
      return 11;
    }
    else {
      return Integer.parseInt(card);
    }
  }

  private static int getCardValue2(String card) {
    Scanner in = new Scanner(System.in);
    int value = 0;

    if(card.equals("J") || card.equals("Q") || card.equals("K")){
      return 10;
    }
    else if(card.equals("A")){
      System.out.printf("Enter value of 1 or 11 for A: ");
      value = in.nextInt();
      return  value;
    }
    else {
      return Integer.parseInt(card);
    }
  }

}
