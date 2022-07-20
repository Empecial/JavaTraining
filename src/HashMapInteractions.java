import java.util.HashMap;

public class HashMapInteractions {
    
    HashMap<String,Integer> employeeIDs = new HashMap<>();
    
    public boolean HashMapCheckIfValueExists(String name)
    {
        if(employeeIDs.containsKey(name))
            return false;

        else
            return true;
    }

    public void HashMapPut(String name, String ID)
    {
        int IDint = Integer.parseInt(ID);
        
        employeeIDs.put(name, IDint);
    }

    public void HashMapReplaceValue(String name, String ReplaceValue)
    {
        int ReplaceValueInt = Integer.parseInt(ReplaceValue);

        employeeIDs.replace(name, ReplaceValueInt);

        System.out.println("The user: " + name.toUpperCase() + " has the new employee ID of " + ReplaceValueInt);
    }
    
    public HashMap<String,Integer> HashMapGet()
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

    public int HashMapGetValue(String NameForID)
    {
        return employeeIDs.get(NameForID);
    }
}