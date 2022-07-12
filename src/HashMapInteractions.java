import java.util.HashMap;

public class HashMapInteractions {
    
    HashMap<String,Integer> employeeIDs = new HashMap<>();

    public void HashMapPut(String name, int age)
    {
        employeeIDs.put(name, age);
    }
}
