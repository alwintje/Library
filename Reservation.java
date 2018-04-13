import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
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
    private double reservationPrice = 0.30;
    private boolean paid;
    
    /**
     * Constructor for objects of class Reservation
     */
    public Reservation(User user, Item item)
    {
        LocalDate localDate = LocalDate.now();
        Date todayDate =  Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.user = user;
        
        this.endDate = addDays(todayDate, 7);
        this.item = item;
    }
    
    private Date addDays(Date date, int days)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
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
    
    public void setPaid(boolean paid){
        this.paid = paid;
    }
    
    public Date getEndDate(){
        return endDate;
    }
    
    public Item getItem(){
        return item;
    }
    
    public double getReservationPrice(){
        LocalDate localDate = LocalDate.now();
        Date todayDate =  Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        if(todayDate.after(endDate)) {
               reservationPrice = reservationPrice + 2;
        }
        return reservationPrice;
    }
    
    
}
