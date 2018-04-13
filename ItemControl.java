
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
    
    public ArrayList<String> penaltiesOverview(String sort){
        ArrayList<String> list = new ArrayList<>(penalties.size());
        // Need sort functionality
        for(Borrow b : penalties){
            list.add(b.getString());
        }
        return list;
    }
    
    public void selectType(String type){
        this.selectedType = type;
    }
    
    public boolean selectByName(String title){
        for(Item item :  items){
            if (item.getTitle().equals(title)){
                selectedItem = item;
                return true;
            }
        }
        return false;
    }
    
    public boolean selectNext(){
        boolean found = false;
        for(Item item :  items){
            if (item == selectedItem && found == false){
                found = true;
            }else if(found == true){
                selectedItem = item;
                return true;
            }
        }
        return false;
    }
    
    public boolean deleteSelected(){
        if( selectedItem == null ) return false;
        return items.remove(selectedItem);
    }
    
    public boolean borrowSelected(User user){
        if(selectedItem == null) return false;
        LocalDate localDate = LocalDate.now();
        Date todayDate =  Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        
        //borrowed = new ArrayList<Borrow>();
        //reservations
        for(Reservation r : reservations){
            if(r.getItem().equals(selectedItem)){
                if(todayDate.before(r.getEndDate())){
                    return false;
                }
            }
        }
        for(Borrow b : borrowed){
            if(b.getItem().equals(selectedItem)){
                if(todayDate.before(b.getEndDate())){
                    return false;
                }
            }
        }
        return borrowed.add(new Borrow(user, todayDate, selectedItem));
        
    }
    
    public String reservateSelected(User user){
        if(selectedItem == null) return "No item selected";
        
        return "Not implemented yet";
    }
    
    public String addItem(Item item){
        items.add(item);
        return null;
    }
    
    public boolean setTitle(String title){
        selectedItem.setTitle(title);
        return false;
    }
    
    public void setCategory(String categorie){
        selectedItem.setCategory(categoryFactory.getCategorie(categorie));
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
    
    public boolean createBook(String category, String title, String author, String publisher){
        Book b = new Book(title);
        b.setCategory(categoryFactory.getCategorie(category));
        b.setAuthor(author);
        b.setPublisher(publisher);
        this.addItem(b);
        return true;
    }
    
    public boolean createCD(String category, String title, String singer){
        CD cd = new CD(title);
        cd.setCategory(categoryFactory.getCategorie(category));
        cd.setArtist(singer);
        
        LocalDate localDate = LocalDate.now();
        Date todayDate =  Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        cd.setDate(todayDate);
        return true;
    }
    
    public boolean createDVD(String category, String title, String director){
        DVD dvd = new DVD(title);
        dvd.setCategory(categoryFactory.getCategorie(category));
        dvd.setDirector(director);
        return false;
    }
}










