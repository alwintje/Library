
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;

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
    
    public void SelectType(String type){
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
        LocalDate localDate = LocalDate.now();
        Date todayDate =  Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        int oldSize = borrowed.size();
        borrowed.add(new Borrow(user, todayDate, selectedItem));
        if(oldSize +1 == borrowed.size()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String reservateSelected(){
        
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
    
    public void setCategory(String category){
        selectedItem.setCategory(categoryFactory.getCategorie(category));
    }
    
    public ArrayList<Borrow> getBorrowList(){
        return borrowed;
    }
    
    private Date getNextAvailableDate(Item item){
        LocalDate localDate = LocalDate.now();
        Date todayDate =  Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date availableDate = todayDate;
        for(Reservation reservation : reservations){
            Item reservationItem = reservation.getItem();
            if(reservationItem.getId() == item.getId()){
                if(availableDate.after(reservation.getEndDate()))
                availableDate = reservation.getEndDate();
            }
        }
        
        return availableDate;
    }
    
    private void deleteReservation(){
        LocalDate localDate = LocalDate.now();
        Date todayDate =  Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        for(Reservation reservation : reservations){
            if(todayDate.after(reservation.getEndDate())) {
               reservation = null;
            }
        }
    }
}










