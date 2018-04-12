
import java.util.ArrayList;
import java.util.Date;

public class ItemControl
{
    // instance variables - replace the example below with your own
    private ArrayList<Item> items;
    private ArrayList<Borrow> penalties;
    private ArrayList<Borrow> borrowed;
    private ArrayList<Reservation> reservations;
    
    private String selectedType;
    private Item selectedItem;
    /**
     * Constructor for objects of class ItemControl
     */
    public ItemControl()
    {
        // initialise instance variables
        items = new ArrayList<Item>();
        penalties = new ArrayList<Borrow>();
        borrowed = new ArrayList<Borrow>();
        reservations = new ArrayList<Reservation>();
    }

    public ArrayList<Borrow> getAllPenalties(){
        return penalties;
    }
    
    public String[] penaltiesOverview(String sort){
        
    }
    
    public boolean SelectType(String type){
        this.selectedType = type;
    }
    
    public boolean SelectByName(String title){
        for(Item item :  items){
            if (item.getTitle().equals(title)){
                selectedItem = item;
                return true;
            }
        }
        return false;
    }
    
    public boolean SelectNext(){
        
    }
    
    public boolean deleteSelected(){
        return false;
    }
    
    public boolean borrowSelected(User user){
        return false;
    }
    
    public String reservateSelected(User user){
        return null;
    }
    
    public String addItem(Item item){
        return null;
    }
    
    public boolean setTitle(){
        return false;
    }
    
    public boolean setCategory(){
        return false;
    }
    
    private String getBorrowList(){
        return null;
    }
    
    private Date getNextAvailableDate(Item item){
        return new Date();
    }
}










