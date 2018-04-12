
/**
 * Write a description of class Acountant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Accountant extends User
{
    /**
     * Constructor for objects of class employee
     */
    public Accountant(String name, String password)
    {
        super(name, password);
    }

    public boolean authorisedTo(String action){       
       if(action == "seeFineOverview"){
            return true;
       }
       
       return false;
    }
    
}
