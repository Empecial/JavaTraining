import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class HashmapTest {
        static String hashmapName = "employeeIDs";
        static String inputReplace = "r";
        static String inputPut = "p";
        static String inputSize = "s";
        static String inputContainsKey = "ck";
        static String inputContainsValue = "cv";
        static String inputClear = "c";
        static String inputIsEmpty = "ie";
        static String inputHelp = "h";
        static String CurrentInput = "";
        static String[] acceptableinputs = {"r","p","s","ck","cv"};


        static Scanner input = new Scanner(System.in);
        
        public static void main(String[] args) {
    
        HashMap<String,Integer> employeeIDs = new HashMap<>();

        
        
        input.useLocale(Locale.US);
        
        System.out.println("current hashmap of " + hashmapName + " has the values " + employeeIDs);
        
        System.out.printf("r = replace, p = put, s = get size, ck = contains key, cv = contains value%nc = clear current hashmap, ie = check if map is empty, h = help%n");

        while(true)
        {
            CurrentInput = input.nextLine();
            if(CurrentInput.equalsIgnoreCase(inputHelp))
            {
                DisplayHelp();
            }
        }
    }

    static void DisplayHelp()
    {
        System.out.printf("r = replace, p = put, s = get size, ck = contains key, cv = contains value%nc = clear current hashmap, ie = check if map is empty%n");
    }

    static void Home()
    {
        while(true)
        {
            CurrentInput = input.nextLine();
    
            if(CurrentInput.equalsIgnoreCase(inputHelp))
            {
                DisplayHelp();
            }
        }
    }

}
