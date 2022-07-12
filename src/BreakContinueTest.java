import java.util.Scanner;

public class BreakContinueTest {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //How do you initialize a String?
    String inputString = "";

    String BreakStatement = "quit";
    String ContinueStatement = "pass";

    while (true) {
      System.out.print("Input: ");
      inputString = input.next();

      if (inputString.equalsIgnoreCase(BreakStatement)) break;

      if (inputString.equalsIgnoreCase(ContinueStatement)) {
        System.out.println("Pass entered - skipping");
        continue;
      }

      System.out.println(inputString);
    }
    input.close();
  }
}
