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
        static final String inputGet = "g";
        static final String inputRemove = "rm";
        static final String inputQuit = "q";
        static String CurrentInput = "";
        static final String[] acceptableinputs = {"r","p","s","ck","cv","c","ie","h","pr"};

        static Scanner scannerInput = new Scanner(System.in);
        
        static HashMapInteractions Hashinteract = new HashMapInteractions();
        public static void main(String[] args) {
    
        
        scannerInput.useLocale(Locale.US);
        
        System.out.printf("Welcome to the employee ID database for Aperture Science Labs Inc. Co. Trademark.%nCurrent hashmap of name " + hashmapName + " has the values " + Hashinteract.HashMapGet() + "%n");
        
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
                
                case inputPut: PutValuesHashMap();
                    break;
                    
                case inputPrint: PrintCurrentHashMap();
                    break;

                case inputContainsKey: ContainsKeyHashMap();
                    break;
                
                case inputContainsValue: ContainsValueHashMap();
                    break;

                case inputClear: ClearHashMap();
                    break;

                case inputIsEmpty: IsEmptyHashMap();
                    break;

                case inputSize: SizeHashMap();
                    break;

                case inputReplace: ReplaceHashMap();
                    break;

                case inputGet: GetHashMap();
                    break;

                case inputRemove: RemoveHashMap();
                    break;

                default: ;
                    break;
            }
        }
    }
    
    static void GetHashMap()
    {
        System.out.println("Which employee's ID number do you need?");

        String employeeNameForID = scannerInput.nextLine();
        int IDfromEmployeeName;

        while(true)
        {
            if(Pattern.matches("[a-zA-Z]+", employeeNameForID))
            {
                if(Hashinteract.employeeIDs.containsKey(employeeNameForID)) 
                {
                    IDfromEmployeeName = Hashinteract.HashMapGetValue(employeeNameForID);
                    System.out.printf("Correct input type - string%n");
                    System.out.printf("Employee exists - fetching%n");
                    break;
                }
                else
                {
                    System.out.printf("Specified name doesn't exist in the hashmap - Try again%n");
                    employeeNameForID = scannerInput.nextLine();
                }
            }
            else
            {
                System.out.printf("Input was not a string. Try again%n");
                employeeNameForID = scannerInput.nextLine();
            }
        }

        System.out.println("The employee - " + employeeNameForID.toUpperCase() + " - has the ID of " + IDfromEmployeeName);
    }

    static void ReplaceHashMap()
    {
        String employeeName = "";
        
        System.out.printf("Enter an employee name%n");

        employeeName = scannerInput.nextLine();
        
        while(true)
        {
            if(Pattern.matches("[a-zA-Z+]+", employeeName))
            {
                if(!Hashinteract.employeeIDs.containsKey(employeeName))
                {
                    System.out.println("This user doesn't exist - Choose a new user");
                    employeeName = scannerInput.nextLine();
                }
                else
                {
                    System.out.println("\nUser exists\nContinuing\n");
                    break;
                }
            }
            else
            {
                System.out.printf("Input was not a string - Try again%n");
                employeeName = scannerInput.nextLine();
            }
        }
                String EmployeeIDReplace = "";
        
                System.out.printf("Enter the new employee ID of "+ employeeName + "%n");
                EmployeeIDReplace = scannerInput.nextLine();
                
                while(true)
                {
                    if(OnlyDigits(EmployeeIDReplace))
                    {
                        if(Hashinteract.employeeIDs.containsValue(Integer.parseInt(EmployeeIDReplace)))
                        {
                            System.out.println("This employee ID already exists - Choose a new ID");
                            EmployeeIDReplace = scannerInput.nextLine();
                        }
                        else
                        {
                            System.out.println("Employee ID changed");
                            break;
                        }
                    }
                    else
                    {
                        System.out.println("Enter a valid ID - Integer values");
                        EmployeeIDReplace = scannerInput.nextLine();
                    }
                }
                
                Hashinteract.HashMapReplaceValue(employeeName, EmployeeIDReplace);
            }

    static void ClearHashMap()
    {
        Hashinteract.employeeIDs.clear();
        System.out.println("Hashmap cleared");
    }

    static void SizeHashMap()
    {
        System.out.println("The size of hashmap: " + hashmapName.toUpperCase() + " is: " + Hashinteract.employeeIDs.size());
    }

    static void IsEmptyHashMap()
    {
        Hashinteract.HashMapIsempty();
    }

    static void PutValuesHashMap()
    {
        String hashmapName;
        
        System.out.printf("Enter an employee name%n");
        hashmapName = scannerInput.nextLine();

        while (true)
        {
            //TODO make the line below check for whitespace
            if(Pattern.matches("[a-zA-Z]+",hashmapName)) {

                //How would you check if the specified name already exists in employeeIDs?
                if(Hashinteract.employeeIDs.containsKey(hashmapName))
                {
                    System.out.printf("%nA user with that name already exists%nChoose another%n");
                    hashmapName = scannerInput.nextLine();
                }
                 //How would you check if the specified name doesn't exist in employeeIDs?
                else if(!Hashinteract.employeeIDs.containsKey(hashmapName))
                {
                    System.out.printf("%nCorrect input type - User doesn't already exist%n");
                    break;
                }
            }

            //What should happen if the input isnt a string?
            else
            {
                System.out.printf("%nWrong input type - Not a string%nTry again%n");
                hashmapName = scannerInput.nextLine();
            }
        }

        System.out.printf("%nEnter an employee ID number%n");
        String hashmapIDint = scannerInput.nextLine();

        while(true)
        {
            if(OnlyDigits(hashmapIDint))
            {
                if(!Hashinteract.employeeIDs.containsValue(Integer.parseInt(hashmapIDint)))
                {
                    System.out.println("Correct input type - Employee ID doesn't already exist");
                    break;
                }
                else
                {
                    System.out.printf("A user with that employee ID already exists%nChoose another%n");
                    hashmapIDint = scannerInput.nextLine();
                }
            }
            else
            {
                System.out.printf("Wrong input type - Not an int%nTry again%n");
                hashmapIDint = scannerInput.nextLine();
            }            
        } 

        Hashinteract.HashMapPut(hashmapName, hashmapIDint);
    }

    static boolean OnlyDigits(String inputString)
    {
       //How would you check if the input only has digits?
       if(Pattern.matches("[0-9]+", inputString))
       {
            return true;
       }
       else
        return false;
    }

    static void PrintCurrentHashMap()
    {
        System.out.println("current hashmap " + hashmapName + " has the values " + Hashinteract.HashMapGet());
    }

    static void ContainsKeyHashMap()
    {
        System.out.printf("What name do you want to check for?%n");
        String KeySearch = scannerInput.nextLine();

        Hashinteract.HashMapContainsKey(KeySearch);
    }

    static void ContainsValueHashMap()
    {
        System.out.println("What employee ID do you want to check if it exists?");
        
        String ValueSearchString = scannerInput.nextLine();

        while(true)
        {
            if(OnlyDigits(ValueSearchString))
            {
                if(!Hashinteract.employeeIDs.containsValue(Integer.parseInt(ValueSearchString)))
                {
                    System.out.printf("%nSpecified employee ID doesn't exist%nCurrent ID's are:" + Hashinteract.employeeIDs.values() + "%nTry again%n");
                    ValueSearchString = scannerInput.nextLine();
                }
                else
                {
                    System.out.printf("%nCorrect input - ID exists: True");
                    break;
                }
            }
            else
            {                                               
                System.out.printf("%nInput needs to be an int - Try again");
                ValueSearchString = scannerInput.nextLine();
            }
        }
    }

    static void RemoveHashMap()
    {                                   
        String removeEmployee = "";

        System.out.println("\nWhich Employee shall be removed?\nType in an Employee name");

        removeEmployee = scannerInput.nextLine();

        while(true)
        {
            if(removeEmployee.equalsIgnoreCase(inputQuit))
            {
                Quit();
            }

            if(Pattern.matches("[a-zA-Z]+", removeEmployee))
            {
                if(Hashinteract.employeeIDs.containsKey(removeEmployee))
                {
                    System.out.println("Valid employee - Removed");
                    break;
                }
                else
                {
                    System.out.println("\nSpecified employee does not exist\nEnter new employee name");
                    removeEmployee = scannerInput.nextLine();
                }
            }
            else
            {
                System.out.println("\nSpecified employee name is not valid - Only strings");
                removeEmployee = scannerInput.nextLine();
            }
        }
        Hashinteract.HashMapRemove(removeEmployee);
    }

    static void Quit()
    {
        System.out.printf("%nQuitting to Home...%n");
        Home();
    }
}