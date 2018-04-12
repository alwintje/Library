
import java.util.ArrayList;
import java.util.Date;

public class ItemControl
{
    // instance variables - replace the example below with your own
    private ArrayList<Item> items;
    private ArrayList<Borrow> penalties;
    private ArrayList<Borrow> borrowed;
    private ArrayList<Reservation> reservations;
    
    private CategoryFactory categoryFactory;
    
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
        
        categoryFactory = new CategoryFactory();
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
        boolean found = false;
        for(Item item :  items){
            if (item == selectedItem && found == false){
                found = true;
            }else if(found = true){
                selectedItem = item;
            }
        }
        return false;
    }
    
    public boolean deleteSelected(){
        return items.remove(selectedItem);
    }
    
    public boolean borrowSelected(User user){
        return false;
    }
    
    public String reservateSelected(User user){
        return null;
    }
    
    public String addItem(Item item){
        items.add(item);
        return null;
    }
    
    public boolean setTitle(String title){
        selectedItem.setTitle(title);
        return false;
    }
    
    public boolean setCategory(String categorie){
        selectedItem.setCategory(categoryFactory.getCategorie(categorie));
    }
    
    private String getBorrowList(){
        return null;
    }
    
    private Date getNextAvailableDate(Item item){
        return new Date();
    }
}










