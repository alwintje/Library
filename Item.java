
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
        id = "id";
        this.category = category;
    }

    public void setTitle(String title){
        this.title = title;
    }
    
    public void setCategory(Category category){
        this.category = category;
    }
    
    public Category getCategory(){
        return category;
    }
}