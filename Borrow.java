import java.util.Date;
import java.util.concurrent.TimeUnit;
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
    
    public Borrow(User user, Date startDate, Date endDate, Item item)
    {
        this.user = user;
        this.startDate = startDate;
        this.endDate = endDate;
        this.item =item;
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
    
    private static long getDateDiff(Date date1, Date date2) {
        long diffInMillies = date2.getTime() - date1.getTime();
        TimeUnit timeUnit =TimeUnit.DAYS;;
        return timeUnit.convert(diffInMillies,TimeUnit.DAYS);
    }
    
    public double calculatePrice(){
        Category category = item.getCategory();
       
        double price;
        
        long daysborrowedLong = getDateDiff(startDate, endDate);
        int daysborrowed = (int) daysborrowedLong;
        if(daysborrowed < category.getBorrowDaysLimit()){
            price = category.getPrice();
            return price;
        }
        else{
            int daysLate = daysborrowed - category.getBorrowDaysLimit();
            price = category.getPrice() + ((daysLate/category.getPenaltyDaysPeriod()) * category.getPenaltyPeriodPrice());
            return price;
        }
    }
}
