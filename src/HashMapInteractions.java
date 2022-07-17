import java.security.Identity;
import java.util.HashMap;

public class HashMapInteractions {
    
    HashMap<String,Integer> employeeIDs = new HashMap<>();
    
    public void HashMapPut(String name, String ID)
    {

        int IDint = Integer.parseInt(ID);

        employeeIDs.put(name, IDint);
    }

    public HashMap<String,Integer> GetHashMap()
    {
        return employeeIDs;
    }

    public void HashMapContainsKey(String key)
    {
        System.out.println(employeeIDs.containsKey(key));        
    }

    public void HashMapContainsValue(int value)
    {
        if(employeeIDs.containsValue(value))
            System.out.println("Specified employee ID exists");
        
        else
            System.out.println("Specified employee ID doesn't exist");
    }

    public void HashMapIsempty()
    {
        System.out.println(employeeIDs.isEmpty());
    }
}