import java.util.Scanner;

public class Practice {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    //name age
    System.out.println("Example 1");

    System.out.print("What is your name? ");
    String name = reader.nextLine();

    System.out.print("How old are you? ");
    int age = Integer.parseInt(reader.nextLine());

    System.out.println("Hi, " + name + "!\nI can't believe you're " + age + " years old!");

    //if else
    System.out.println("Example 2");

    System.out.print("Type the first number: ");
    int number = Integer.parseInt(reader.nextLine());

    System.out.print("Type the second number: ");
    int numberTwo = Integer.parseInt(reader.nextLine());

    if (number == numberTwo) {
      System.out.print("The numbers are equal!");
    } else if (number > numberTwo) {
      System.out.print("Greater number: " + number);
    } else if (numberTwo > number) {
      System.out.println("Greater number: " + numberTwo);
    }

    //if elseif
    System.out.println("Example 3");

    System.out.print("Type the points [0-60]: ");
    int points = Integer.parseInt(reader.nextLine());

    if (points < 29) {
      System.out.print("failed");
    } else if (points > 30 && points < 34) {
      System.out.print("1");
    } else if (points > 40 && points < 44) {
      System.out.print("2");
    } else if (points > 45 && points < 49) {
      System.out.print("3");
    } else if (points > 50 && points < 60) {
      System.out.print("5");
    }

  }
}