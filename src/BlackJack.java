import java.util.Scanner;

public class BlackJack {
  public static void main(String args[]) {
//     Original();
    Bonus();
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

  protected static void Bonus(){
    String card1, card2;
    int num1 = 0, num2 = 0, sum = 0;
    Scanner in = new Scanner(System.in);

    System.out.println("Hello, let's play some BlackJack!");

    do {
      // Prompt user for card value
      System.out.printf("Enter your first card: ");

      // Read in card value as a String
      card1 = in.next();

      /*
       * Call getCardValue2() method to return numeric value of input, assign this
       * numeric value to the num1 variable
       *
       * Then, convert the string input to uppercase and pass it into the
       * getCardValue() method
       */
      num1 = getCardValue(card1.toUpperCase());
      num1 = checkValue(num1);

      System.out.printf("Enter your second card: ");
      card2 = in.next();
      num2 = getCardValue(card2.toUpperCase());
      num2 = checkValue(num2);

      sum = num1 + num2;

      printSum(sum);
    } while(sum != 21 && sum != 0);

    System.out.println("It was a nice game, goodbye.");
  }

  protected static void Bonus2(){
    String card1, card2;
    int num1 = 0, num2 = 0, sum = 0;
    Scanner in = new Scanner(System.in);

    System.out.println("Hello, let's play some BlackJack!");

    do {
      // Prompt user for card value
      System.out.printf("Enter your first card: ");

      // Read in card value as a String
      card1 = in.next();

      /*
       * Call getCardValue2() method to return numeric value of input, assign this
       * numeric value to the num1 variable
       *
       * Then, convert the string input to uppercase and pass it into the
       * getCardValue2() method
       */
      num1 = getCardValue2(card1.toUpperCase(), 0);
      num1 = checkValue(num1);

      System.out.printf("Enter your second card: ");
      card2 = in.next();
      num2 = getCardValue2(card2.toUpperCase(), num1);
      num2 = checkValue(num2);

      sum = num1 + num2;

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

  private static int getCardValue(String card) {
    // Check if card value passed in is J,Q,K, if so, return a numeric value of 10
    if(card.equals("J") || card.equals("Q") || card.equals("K")){
      return 10;
    }
    // If input was A, return 11
    else if(card.equals("A")){
      return 11;
    }
    else {
      // Else, just return the value inputted converted from a string to integer
      return Integer.parseInt(card);
    }
  }

  private static int getCardValue2(String card, int num1) {
    Scanner in = new Scanner(System.in);
    int value = 0;

    if(card.equals("J") || card.equals("Q") || card.equals("K")){
      return 10;
    }
    else if(card.equals("A")){
      if(num1 == 11){
        return 1;
      }
      else {
        System.out.printf("Enter value of 1 or 11 for A: ");
        value = in.nextInt();
        return value;
      }
    }
    else {
      return Integer.parseInt(card);
    }
  }

  private static int checkValue(int input){
    Scanner in  = new Scanner(System.in);
    String newInput;

    while(input <0 ||  input >11) {
      System.out.printf("Card value invalid, please enter value from 0 to 11: ");
      newInput = in.next();
      input = getCardValue(newInput.toUpperCase());
    }

    return input;
  }




}
