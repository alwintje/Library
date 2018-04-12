
/**
 * Write a description of class Member here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Member extends User
{
    String actions[];
    
    /**
     * Constructor for objects of class employee
     */
    public Member(String name, String password)
    {
        super(name, password);
        
        actions = new String[] {"depositItem" , "borrowitem" , "reservateitem" , "getpenalty"};
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
