
/**
 * Write a description of class CD here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book extends Item
{
    // instance variables - replace the example below with your own
    private String author;
    private String publisher;
    
    /**
     * Constructor for objects of class Item
     */
    public Book(String title)
    {
        super(title);
    }

    public void setAuthor(String author){
        this.author = author;
    }
    
    public String getAuthor(String author){
        return author;
    }
    
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    
    public String getPublisher(String publisher){
        return publisher;
    }
}
