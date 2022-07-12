public class StaticPublicMethodTest {

  static double StaticMathAdd(double input1, double input2) {
    return input1 + input2;
  }

  static void StaticVoid(int Speed) {
    if (Speed > 10) {
      System.out.println("Wow your speed is " + Speed);
    } else {
      System.out.println("U r slow");
    }
  }

  public void PublicMethod(String Name) {
    switch (Name) {
      case "emp":
        System.out.println("ur name is emp");
        break;
      case "lol":
        System.out.println("lol nice name");
        break;
      default:
        System.out.println("You messed up");
    }
  }

  public static void main(String[] args) {
    StaticPublicMethodTest RefTest2 = new StaticPublicMethodTest();
    RefTest2.PublicMethod("emp");

    System.out.println("The result is " + StaticMathAdd(3.2, 3.2));

    StaticVoid(15);
  }
}
