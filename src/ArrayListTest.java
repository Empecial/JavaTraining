import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ArrayListTest {

    static ArrayList<Integer> randomIntArrayList = new ArrayList<Integer>();
    
    static Random rand = new Random();

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        fillArrayListRandomly(randomIntArrayList);

        printArrayList(randomIntArrayList);
    }

    static void printArrayList(ArrayList<Integer> randomArrayList){

        Iterator<Integer> iterator = randomIntArrayList.iterator();
        
        int i = 1;

        int index = i--;


        while(iterator.hasNext()){

            System.out.println("Index " + i + " has value: " + iterator.next());

            i++;
        }
    }

    static public void fillArrayListRandomly(ArrayList<Integer> randomArrayList){

        while(true){

            System.out.println("How many numbers should be in the arraylist?");

            String generatedNumbersAmountString = input.nextLine();
            
            if(Pattern.matches("\\d+", generatedNumbersAmountString)){
                int generatedNumbersAmountInt = Integer.parseInt(generatedNumbersAmountString);

                for (int i = 0; i < generatedNumbersAmountInt; i++) {
        
                    int randNumberFifty = rand.nextInt(50);
                    randomIntArrayList.add(randNumberFifty);
        
                    System.out.println("The specified arraylist has the value " + randNumberFifty + " at index " + i );
                }

                break;
            } 
            else {
                System.out.println("Input wasnt a digit. try again");
                 }
            }
        }

    static public void clearArray(ArrayList<Integer> arrayList){

        arrayList.clear();

        System.out.println("ArrayList has been cleared. ArrayList currently has " + arrayList);
    }
}