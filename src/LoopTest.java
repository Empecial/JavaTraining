import java.util.Arrays;

public class LoopTest {

  public static void main(String[] args) {
    int Money = 2;

    int[] Networth = new int[20];

    char[] Characters = {
      'a',
      'b',
      'C',
      'E',
      'F',
      'f',
      'A',
      'h',
      'V',
      'x',
      'R',
      'v',
      'M',
      'm',
      'N',
      'n',
      'y',
      'Y',
      'p',
      'P',
    };

    boolean EligibleValue = false;

    for (int i = 0; i < 20; i++) {
      System.out.println(i);

      Money *= 2;

      //How would money be assigned to each individual person's networth?
      Networth[i] = Money;

      System.out.println(
        Characters[i] +
        " has a networth position " +
        i +
        " with a value of " +
        Networth[i]
      );
      System.out.println(
        Characters[i] + " has a money amount of about " + Money
      );

      switch (Money) {
        case 4:
          System.out.println(Characters[i] + "'s Networth has the value of 4");
          EligibleValue = true;

          break;
        default:
          System.out.println("Shit messed up");
      }
    }

    if (EligibleValue) {
      Money += 1;
      System.out.println((Money - 1) + " + 1 = " + Money);
      System.out.println(Arrays.toString(Networth));
    }
  }
}
