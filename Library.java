import java.util.ArrayList;
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private UserControl userControl;
    private ItemControl itemControl;

    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        itemControl = new ItemControl();
        userControl = new UserControl();
    }
    
    public boolean selectUserByName(String name){
        return userControl.selectByName(name);
    }

    public String getSelectedUserName(){
        return userControl.getSelectedUserName();
    }
    
    public String getLoggedInUserName(){
        return userControl.getLoggedInUserName();
    }
    
    public boolean login(String name, String password){
        return userControl.login(name, password);
    }
    
    public boolean createUser(String role, String name, String password){
        return userControl.createUser(role,name,password);
    }
    
    public boolean registerUser(String name, String password){
        return userControl.createUser("Member",name,password);
    }
    
    public boolean deleteSelectedUser(){
        return userControl.deleteSelected();
    }
    
    public void getAllPaidBorrows(){
        
    }
    
    public String selectTypeByName(String type){
        itemControl.selectType(type);
        return "Done";
    }
    
    public String selectItemByName(String title){
        return itemControl.selectByName(title) ? "Done" : "Can't select item";
    }
    
    public String selectitemByID(String id){
        return null;
    }
    
    public String getSelectedItemName(){
        return null;
    }
    
    public boolean selectNextItem(){
        return false;
    }
    
    public boolean deleteSelectedItem(){
        return false;
    }
    
    public String reservateSelectedItem(){
        return null;
    }
    
    public String borrowSelectedItem(){
        return null;
    }
    
    public String returnItemById(String id){
        return null;
    }
    
    public String[] printFineOverview(String sort){
        return null;
    }
    
    public boolean setTitleSelecteditem(){
        return false;
    }
    
    public boolean createBook(String category, String title, String author, String publisher){
        return itemControl.createBook(category, title, author, publisher);
    }
    
    public boolean createCD(String category, String title, String singer){
        return itemControl.createCD(category, title, singer);
    }
    
    public boolean createDVD(String category, String title, String director){
        return itemControl.createDVD(category, title, director);
    }
    
}











