import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class BlackJack {
  public static void main(String args[]) {
     Original();
//     Bonus();
//     Bonus2();
  }

  protected static void Original(){
    int num1 = 0, num2 = 0, sum = 0;
    Scanner in = new Scanner(System.in);

    System.out.println("Hello, let's play some BlackJack!");
    System.out.printf("Enter your first number: ");
    num1 = in.nextInt();

    System.out.printf("Enter your second number: ");
    num2 = in.nextInt();

    sum = num1 + num2;

    printSum(sum);

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

  private static void printSum(int sum) {
    switch(sum) {
      case 21:
        System.out.println("Sum: *" + sum);
        break;
      case 0:
        break;
      default:
        System.out.println("Sum: " + sum);
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
