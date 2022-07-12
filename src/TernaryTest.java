import java.util.Scanner;

public class TernaryTest {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("What is ur income per month from 0-200?");
    int income = input.nextInt();

    input.close();

    String ClassRank = income > 120 ? "Highend" : "lowend";
    String ClassRank2 = income <= 120 ? "lowend" : "Highend";

    System.out.println(ClassRank);

    if (ClassRank.equals("Highend")) {
      HighClass(ClassRank);
    } else {
      LowClass(ClassRank2);
    }
  }

  static void HighClass(String Class) {
    float HighClassIncome = 34f;
    System.out.printf(
      "Ur class is %s and u get a bonus of %.1f bucks",
      Class,
      HighClassIncome
    );
  }

  static void LowClass(String Class) {
    byte LowClassIncome = 127;
    System.out.printf(
      "Ur class is only %s and u get a bonus of %d doleros",
      Class,
      LowClassIncome
    );
  }
}
