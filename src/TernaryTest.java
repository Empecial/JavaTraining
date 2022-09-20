import java.util.Scanner;
import java.util.regex.Pattern;

public class TernaryTest {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("What is ur income per month from 0-200?");

    String income;
    int incomeInt = 0;
    income = input.nextLine();

    //TODO
    if(Pattern.matches("\\d+", income)) {
      incomeInt = Integer.parseInt(income);
    }
    else {
      System.out.println("Wrong input type -  income can only be digits");
    }

    input.close();

    String ClassRank = incomeInt > 120 ? "Highend" : "lowend";
    String ClassRank2 = incomeInt <= 120 ? "lowend" : "Highend";

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
