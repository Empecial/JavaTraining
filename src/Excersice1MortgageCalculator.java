import java.util.Locale;
import java.util.Scanner;

public class Excersice1MortgageCalculator {
    public static void main(String[] args) {

        /*P = principle, amount to loan
         * 
         * r = monthly interest rate, get it by dividing with 100 for decimals and the annual rate by 12
         * 
         * n = amount of payments
         */
        
         MortgageInput();
        
    }


    static void MortgageInput()
    {
        float principal;
        double annualInterestRate;
        byte amountOfPaymentsYear;

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        do {
            System.out.printf("%nEnter a number between $1k-$1m%n");

            principal=input.nextFloat();

        } while (principal < 1_000 || principal>1_000_000);
        
        do {
            System.out.printf("%nEnter annual interest rate in percent. ");
            System.out.printf("Must be a value greater than 0 and equal to or less than 30%n");
            annualInterestRate = input.nextFloat();

        } while (annualInterestRate <= 0 || annualInterestRate > 30);

        do {
            System.out.printf("%nPayment period in years from 1-30: ");
            amountOfPaymentsYear = input.nextByte();
        
        }while (amountOfPaymentsYear < 1 || amountOfPaymentsYear > 30);

        CalculateMortgage(principal, annualInterestRate, amountOfPaymentsYear, input);
    }

    static void CalculateMortgage(float principal, double annualInterestRate, int amountOfPaymentsYear, Scanner input)
    {
        double monthlyInterestRateDecimal = annualInterestRate/100/12;
        
        int amountOfPaymentsInMonths = amountOfPaymentsYear*12;

        double MonthlyInterestExponentResult = Math.pow(1+monthlyInterestRateDecimal, amountOfPaymentsInMonths);

        double mortgage = principal*(monthlyInterestRateDecimal * MonthlyInterestExponentResult) / (MonthlyInterestExponentResult-1);

        System.out.printf("Ur mortgage will be $%.2f %n", mortgage);

        System.out.printf("%nDo you want to calculate again? y or n%n");

        String ChooseRestartCalculator = input.next();

        while(true)
        {
            if(ChooseRestartCalculator.equalsIgnoreCase("y"))
            {
                MortgageInput();
            }

            if (ChooseRestartCalculator.equalsIgnoreCase("n")) 
            {
                System.out.printf("%nExiting%n");
                System.exit(0);
            }
        }
    }
}