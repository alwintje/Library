import java.util.*;
import java.time.*;
import java.text.*;
/**
 * Write a description of class CD here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CD extends Item
{
    // instance variables - replace the example below with your own
    private String artist;
    private Date date;
    private static final DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    /**
     * Constructor for objects of class Item
     */
    public CD(String title)
    {
        super(title);
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public Date setDate(Date date){
        this.date = date;
    }

    public String getArtist(){
        return artist;
    }

    public Date getDate(){
        return date;
    }
    
    public Double getDiscount(double price){
        //onder 1 jaar, geenkorting
        //1 tot 5 jaar = 10%
        //ouder dan 5 jaar = 50%
        return price;
    }
}
