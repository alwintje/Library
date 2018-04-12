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
        return false;
    }

    public String getSelectedUserName(){
        return null;
    }
    
    public String getLoggedInUserName(){
        return null;
    }
    
    public boolean login(String name, String password){
        return false;
    }
    
    public boolean createUser(String role, String name, String password){
        return false;
    }
    
    public boolean registerUser(String name, String password){
        return false;
    }
    
    public void deleteSelectedUser(){
        
    }
    
    public void getAllPaidBorrows(){
        
    }
    
    public String selectTypeByName(String type){
        return null;
    }
    
    public String selectitemByName(String title){
        return null;
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
    
    public boolean createBook(String title, String author, String publisher, String categorie){
        
    }
    
    public boolean createCD(String title, String singer, String categorie){
        
    }
    
    public boolean createDVD(String title, String director, String categorie){
        
    }
    
    public boolean createUser(String name, String password){
        
    }
}











