import java.util.Locale;
import java.util.Scanner;

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
        while(true)
        {

            System.out.printf("%ninput: ");
            CurrentInput = scannerInput.nextLine();

            switch (CurrentInput.toLowerCase()) {

                case inputHelp: DisplayHelp();
                    break;
                
                    case inputPut: HashMapPutValues();
                    break;
                    
                    case inputPrint: PrintCurrentHashMap();
                    break;
                    
                    default: DisplayHelp();
                    break;
                }
            }
    }
    
    static void HashMapPutValues()
    {
        System.out.printf("Enter a string value%n");
    
        String hashmapString = scannerInput.nextLine();
    
        System.out.printf("%nEnter an integer%n");
        int hashmapInt = scannerInput.nextInt();
    
        Hashinteract.HashMapPut(hashmapString, hashmapInt);
        System.out.println("done");
    }


    static void PrintCurrentHashMap()
    {
        if(CurrentInput.equalsIgnoreCase(inputPrint))
        {
            System.out.println("current hashmap of " + hashmapName + " has the values " + Hashinteract.GetHashMap());
        }
    }
}
