import java.util.Date;
/**
 * Write a description of class Reservation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reservation
{
    // instance variables - replace the example below with your own
    private User user;
    private Date endDate;
    private Item item;
    private double reservationPrice;
    
    /**
     * Constructor for objects of class Reservation
     */
    public Reservation(User user, Date date, Item item, double price)
    {
        this.user = user;
        this.endDate = date;
        this.item = item;
        this.reservationPrice = price;
    }
    
    public void setUser(User user){
        this.user = user;
    }
    
    public void setEndDate(Date date){
        this.endDate = date;
    }
    
    public void setItem(Item item){
        this.item = item;
    }
    
    public void setReservationPrice(double price){
        this.reservationPrice = price;
    }
    
    public User getUser(){
        return user;
    }
    
    public Date getEndDate(){
        return endDate;
    }
    
    public Item getItem(){
        return item;
    }
    
    public double getReservationPrice(){
        return reservationPrice;
    }
}
