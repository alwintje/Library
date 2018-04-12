import java.util.Date;
/**
 * Write a description of class borrow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Borrow
{
    // instance variables - replace the example below with your own
    private User user;
    private Date startDate;
    private Date endDate;
    
    private Item item; 
    private int numberOfWarnings; 
    
    private boolean paid;
    private boolean returned;
    
    public Borrow()
    {
        
    }

    public User getUser(){
        return user;
    }
    
    public Date getStartDate(){
        return startDate;
    }
    
    public Date getEndDate(){
        return endDate;
    }
    
    public int calculatePrice(){
        return null;
    }
}
