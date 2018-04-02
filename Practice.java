import java.util.Scanner;

public class Practice {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("What is your name? ");
    String name = reader.nextLine();

    System.out.print("How old are you? ");
    int age = Integer.parseInt(reader.nextLine());

    System.out.println("Hi, " + name + "!\nI can't believe you're " + age + " years old!");
  }
}