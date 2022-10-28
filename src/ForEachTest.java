public class ForEachTest {

  public static void main(String[] args) {
    String[] fruits = { "Apple", "mango", "Yomama" };

    int index = 0;

    for (String fruitString : fruits) {
        index++;

      System.out.println("This fruit is a " + fruitString.toUpperCase());

      if(fruitString.equalsIgnoreCase("Yomama")){
        System.out.println("Currently the fruit is a mama fruit at index " + index);
      }
    }
  }
}