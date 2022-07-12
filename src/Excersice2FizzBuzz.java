import java.util.Scanner;

public class Excersice2FizzBuzz {

  public static void main(String[] args) {
    /* divisible by 5, fizz
        divisible by 3, buzz
        divisible by 3 and 5, fizzbuzz
        if not disivisble by both, print input number out
         */

    Scanner input = new Scanner(System.in);

    System.out.printf(
      "Choose an answer for the Fizzbuzz excersice%n1 is the original answer, 2 is Mosh's answer%n"
    );
    int ChooseAnswer = input.nextInt();
    boolean InfiniteReplay = true;

    do {
      switch (ChooseAnswer) {
        case 1:
          OriginalAnswer(InfiniteReplay, input);
          break;
        case 2:
          MoshAnswer(InfiniteReplay, input);
          break;
        default:
          System.out.println("Choose either 1 or 2, young man");
      }
    } while (ChooseAnswer != 1 || ChooseAnswer != 2);
  }

  static void OriginalAnswer(boolean InfiniteReplay, Scanner scanner) {
    while (InfiniteReplay) {
      System.out.print("Enter Number: ");

      int IntInput = scanner.nextInt();

      if (IntInput > 10) {
        if (IntInput % 5 == 0 && IntInput % 3 == 0) {
          System.out.println("fizzbuzz");
        }
      } else if (IntInput % 3 == 0) {
        System.out.println("buzz");
      } else if (IntInput % 5 == 0) {
        System.out.println("fizz");
      } else {
        System.out.println(IntInput);
      }
    }
  }

  static void MoshAnswer(boolean InfiniteReplay, Scanner scanner) {
    while (InfiniteReplay) {
      System.out.print("Enter Number: ");

      int intInput = scanner.nextInt();

      if (intInput % 5 == 0 && intInput % 3 == 0) {
        System.out.println("Fizzbuzz");
      } else if (intInput % 5 == 0) {
        System.out.println("Fizz");
      } else if (intInput % 3 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(intInput);
      }
    }
  }
}
