import java.util.ArrayList;
import java.util.Random;

public class ArrayListTest {

    static ArrayList<Integer> randomIntArrayList = new ArrayList<Integer>();
    static Random rand = new Random();
    public static void main(String[] args) {
        
        fillArrayListRandomly(randomIntArrayList);

        clearArray(randomIntArrayList);
    }

    static public void fillArrayListRandomly(ArrayList<Integer> randomArrayList){
        for (int i = 0; i < 50; i++) {

            int randNumberFifty = rand.nextInt(50);
            randomIntArrayList.add(randNumberFifty);

            System.out.println("The specified arraylist has the value " + randNumberFifty + " at index " + i );
        }
    }

    static public void clearArray(ArrayList<Integer> arrayList){
        arrayList.clear();

        System.out.println("Array has been cleared and left with " + arrayList);
    }
}