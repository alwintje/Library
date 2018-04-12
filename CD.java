
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
    
    /**
     * Constructor for objects of class Item
     */
    public CD(String title, Category category, String artist)
    {
        super(title, category);
        this.artist = artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }
    
    public String getArtist(String artist){
        return artist;
    }
}
