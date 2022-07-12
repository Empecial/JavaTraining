import java.util.Scanner;
public class GetandSetTest {
    static String Name;
    static int Age;

    static Scanner input = new Scanner(System.in);

    static GetandSetValues setGet = new GetandSetValues();
    public static void main(String[] args) {

        RequestName();

        RequestAge();

        System.out.printf("Ur name is " + setGet.getName() + " %nAnd ur age is %d", setGet.getAge() );
    }

    static void RequestName()
    {
        System.out.println("Enter your name");
        
        String Name = input.nextLine();
        
        setGet.setName(Name);
    }
    
    static void RequestAge()
    {
        System.out.println("What is ur age?");
        
        int Age = input.nextByte();

        setGet.setAge(Age);
    }

}
