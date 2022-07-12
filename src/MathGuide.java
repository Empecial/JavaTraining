public class MathGuide {

  public static void main(String[] args) {
    int randomnum = (int) (Math.random() * 101);

    System.out.println(randomnum);

    int i = 0;

    do {
      System.out.println("do/while = " + i);
      i++;
    } while (i < 6);

    for (int j = 0; j < 6; j++) {
      System.out.println("for = " + j);
    }
  }
}
