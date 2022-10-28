import java.util.Scanner;

public class OddEvenIdentifier {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an integer number");

    int N = scanner.nextInt();

    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    scanner.close();

    if (N % 2 != 0) {
      System.out.println("Odd");
    } else if (N % 2 == 0) {
      if (N >= 2 && N <= 5) {
        System.out.println("Number is between 2 and 5 and is Even");
      } else if (N >= 6 && N <= 20) {
        System.out.println("Number is between 6 and 20 and is Even");
      } else {
        System.out.println(
          "Number is outside of the specified ranges and is even"
        );
      }
    }
  }
}