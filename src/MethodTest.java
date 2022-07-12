public class MethodTest {

  static void AgeChecker(int age) {
    if (age >= 18) {
      System.out.println("old enough, have fun mate");
    } else {
      System.out.println("Not old enough, mate");
    }
  }

  static boolean BoolInverter(boolean input) {
    input = !input;

    return input;
  }

  public static void main(String[] args) {
    AgeChecker(18);

    boolean BoolMethodResult = BoolInverter(false);

    if (BoolMethodResult) {
      System.out.println(
        "Congrats mate, ur bool has the value of " + BoolMethodResult
      );
    } else {
      System.out.println(
        "Sorry mate, ur bool has the value of " + BoolMethodResult
      );
    }
  }
}
