import java.util.*;
/**
 * Write a description of class employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee extends User
{
    String actions[];
    
    /**
     * Constructor for objects of class employee
     */
    public Employee(String name, String password)
    {
        super(name, password);
        
        actions = new String[] {"depositItem" , "borrowitem" , "reservateitem" , "getpenalty" , "addUser" , "deleteUser" , "changeUser" , "addItem" , "deleteitem" , "changeItem"};
    }

    public boolean authorisedTo(String action){
       for (String pointer: actions) {           
        if(pointer == action){
            return true;
        }
       }
       return false;
    }
    
}
