
/**
 * Write a description of class DVD here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class DVD extends Item
{
    // instance variables - replace the example below with your own
    private String director;
    
    /**
     * Constructor for objects of class Item
     */
    public DVD(String title, Category category, String director)
    {
        super(title, category);
        this.director = director;
    }

    public void setDirector(String director){
        this.director = director;
    }
    
    public String getDirector(String director){
        return director;
    }

}
