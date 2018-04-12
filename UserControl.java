
/**
 * Write a description of class UserControl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class UserControl
{
    // instance variables - replace the example below with your own
    private ArrayList<User> users;
    private User selectedUser;
    private User loggedInUser;

    public UserControl()
    {
        users = new ArrayList<User>();
    }
    
    public boolean createUser(String Role, String name, String password){
        return false;
    }
    
    public void selectByName(String string){
        
    }
    
    public boolean Login(String name, String password){
        return false;
    }
    
    public boolean Logout(){
        return false;
    }
    
    public User getLoggedInUser(){
        return loggedInUser;
    }
    
    public User getSelectedUser(){
        return selectedUser;
    }
    
    public boolean GetSelectedUserName(){
        return selectedUser.getName();
    }
    
    public boolean SetSelectedUserName(String name){
        selectedUser.setName(name);
        return true;
    }
    
    public boolean SetSelectedUserPassword(String name){
        selectedUser.setPassword(name);
        return true;
    }
    
    public Boolean DeleteSelected(){
        return false;
    }
    
    
}
