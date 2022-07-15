import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HashmapTest {

    //What are the variables valid for input by user?
        static final String hashmapName = "employeeIDs";
        static final String inputReplace = "r";
        static final String inputPut = "p";
        static final String inputSize = "s";
        static final String inputContainsKey = "ck";
        static final String inputContainsValue = "cv";
        static final String inputClear = "c";
        static final String inputIsEmpty = "ie";
        static final String inputHelp = "h";
        static final String inputPrint = "pr";
        static String CurrentInput = "";
        static final String[] acceptableinputs = {"r","p","s","ck","cv","c","ie","h","pr"};

        static Scanner scannerInput = new Scanner(System.in);
        
        static HashMapInteractions Hashinteract = new HashMapInteractions();
        public static void main(String[] args) {
    
        
        scannerInput.useLocale(Locale.US);
        
        System.out.printf("Welcome to the employee ID database for Aperture Science Labs Inc. Co. Trademark.%nCurrent hashmap of name " + hashmapName + " has the values " + Hashinteract.GetHashMap() + "%n");
        
        DisplayHelp();

        Home();
    }

    static void DisplayHelp()
    {
        System.out.printf("%nValid inputs are: r = replace, p = put, s = get size, ck = contains key, cv = contains value%nc = clear current hashmap, ie = check if map is empty, h = help%n"+
        "pr = print%n");
    }

    static void Home()
    {
        while (true)
        {
            System.out.print("Input: ");

            CurrentInput = scannerInput.nextLine();

            switch (CurrentInput.toLowerCase()) {

                case inputHelp: DisplayHelp();
                    break;
                
                case inputPut: HashMapPutValues();
                    break;
                    
                case inputPrint: PrintCurrentHashMap();
                    break;

                case inputContainsKey: ContainsKeyHashMap();
                    break;
                
                case inputContainsValue: ContainsValueHashMap();
                break;

                case inputClear: HashMapClear();
                    break;

                default: ;
                    break;
            }
        }
    }
    
    static void HashMapClear()
    {
    Hashinteract.employeeIDs.clear();
    System.out.println("Hashmap cleared");
    }

    static void HashMapPutValues()
    {
        String hashmapString = "";
        
        System.out.printf("Enter an employee name%n");
        hashmapString = scannerInput.nextLine();

        while (true)
        {
            if(Pattern.matches("[a-zA-Z]+",hashmapString))
            {
                System.out.printf("%nCorrect input type%n");
                break;
            }
            else
            {
                System.out.printf("%nWrong input type - Not a string%nTry again%n");
                hashmapString = scannerInput.nextLine();
            }
        }

        System.out.printf("%nEnter an employee ID number%n");
        int hashmapInt = 0;

        while(true)
        {
            try {
                hashmapInt = scannerInput.nextInt();
            } catch (Exception e) {
                System.out.printf("%nWrong input type - Not an int%nTry again");
                hashmapInt = scannerInput.nextInt();
            }
            break;  
        } 

        Hashinteract.HashMapPut(hashmapString, hashmapInt);
    }

    static void PrintCurrentHashMap()
    {
        if(CurrentInput.equalsIgnoreCase(inputPrint))
        {
            System.out.println("current hashmap of " + hashmapName + " has the values " + Hashinteract.GetHashMap());
        }
    }

    static void ContainsKeyHashMap()
    {
        System.out.printf("What name do you want to check for?%n");
        String KeySearch = scannerInput.nextLine();

        Hashinteract.HashMapContainsKey(KeySearch);
    }

    static void ContainsValueHashMap()
    {
    System.out.println("What employee ID do you want to check for?");
    int ValueSearch = scannerInput.nextInt();

    Hashinteract.HashMapContainsValue(ValueSearch);
    }
}
