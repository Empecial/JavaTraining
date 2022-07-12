import java.util.Scanner;

public class DoWhileTest {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String Answer;

    do {
      System.out.println("What will you pay for these tissues?");
      double Price = input.nextDouble();

      System.out.println("How many do you want?");
      int Quantity = input.nextInt();

      double Cost = Price * Quantity;

      System.out.printf("The total is $%.2f%n", Cost);

      System.out.println("Try again?");
      Answer = input.next();
    } while (Answer.equalsIgnoreCase("Yes"));

    input.close();
  }
}
