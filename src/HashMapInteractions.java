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
        System.out.printf("%nEmployee added to database. Welcome.%n");
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
    
    public boolean HashMapContainsKey(String key)
    {
        return employeeIDs.containsKey(key);        
    }

    public void HashMapIsempty()
    {
        System.out.println("Current hashmap is empty: " + employeeIDs.isEmpty());
    }

    public int HashMapGetValue(String NameForID)
    {
        return employeeIDs.get(NameForID);
    }

    public void HashMapRemove(String EmployeeRemove)
    {
        String DeletedEmployeeID =  employeeIDs.remove(EmployeeRemove).toString();
        System.out.println("Deleted specified employee with the ID - " + DeletedEmployeeID + " from EmployeeIDs");
    }
}