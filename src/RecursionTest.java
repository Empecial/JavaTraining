public class RecursionTest {

  public static void main(String[] args) {
    int result = sum(10);
    int result2 = HaltingCon(5, 10);

    System.out.println(result);
    System.out.println(result2);
  }

  public static int HaltingCon(int start, int end) {
    if (end > start) {
      return end + HaltingCon(start, end - 1);
    } else {
      return end;
    }
  }

  public static int sum(int input) {
    if (input > 0) {
      return input + sum(input - 1);
    } else {
      return 0;
    }
  }
}
