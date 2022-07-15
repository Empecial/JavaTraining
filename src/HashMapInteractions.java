import java.util.HashMap;

public class HashMapInteractions {
    
    HashMap<String,Integer> employeeIDs = new HashMap<>();
    
    public void HashMapPut(String name, int age)
    {
        employeeIDs.put(name, age);
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
}
