import java.util.Scanner;

public class InputTest {

  public static void main(String[] args) {
    double Principal = 0;

    double AnnualInterest;

    byte Period;

    System.out.println("What is ur Principal loan amount?");

    System.out.println("What is ur annual interest rate?");
    Scanner AnnualInterestinput = new Scanner(System.in);
    AnnualInterest = AnnualInterestinput.nextDouble();
    AnnualInterestinput.close();

    System.out.println("For how many years will you be paying off the loan?");
    Scanner PeriodInput = new Scanner(System.in);
    Period = PeriodInput.nextByte();
    PeriodInput.close();

    System.out.println(
      "your mortgage after" +
      Period +
      "with an annual interest rate of " +
      AnnualInterest +
      " based on a principal loan" +
      "of " +
      Principal +
      " comes out to a mortgage of about "
    );
  }

  static void ScannerInputDouble(double InputDouble) {
    Scanner DoubleInput = new Scanner(System.in);
    InputDouble = DoubleInput.nextByte();
    DoubleInput.close();
  }
}
