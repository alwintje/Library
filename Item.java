import java.util.UUID;
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Item

{
    private String title;
    private String id;
    private Category category;
    
    /**
     * Constructor for objects of class Item
     */
    public Item(String title, Category category)
    {
        this.title = title;
        this.id = generateString();
        this.category = category;
    }
    
    private static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }

    public void setTitle(String title){
        this.title = title;
    }
    
    public void setCategory(Category category){
        this.category = category;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getId(){
        return id;
    }
    
    public Category getCategory(){
        return category;
    }
}