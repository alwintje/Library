import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
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
    Category category = item.getCategory();
    private int numberOfWarnings; 
    
    private boolean paid;
    private boolean returned;
    
    public Borrow(User user, Date startDate, Item item)
    {
        this.user = user;
        this.startDate = startDate;
        this.item =item;
        this.endDate = addDays(startDate, category.getBorrowDaysLimit());
    }  
    
    private Date addDays(Date date, int days)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
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
