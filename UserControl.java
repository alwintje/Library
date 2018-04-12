
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
        selectedUser = null;
        loggedInUser = null;
    }
    
    public boolean createUser(String Role, String name, String password){
        users.add(new Employee("Name","Password"));
        return true;
    }
    
    public boolean selectByName(String string){
        for(User user :  users){
            if (user.getName().equals(string)){
                selectedUser = user;
                return true;
            }
        }
        return false;
    }
    
    public boolean Login(String name, String password){
        for(User user :  users){
            if (user.getName().equals(name) && user.getPassword().equals(password)){
                loggedInUser = user;
                return true;
            }
        }
        return false;
    }
    
    public boolean Logout(){
        loggedInUser = null;
        return true;
    }
    
    public User getLoggedInUser(){
        return loggedInUser;
    }
    
    public User getSelectedUser(){
        return selectedUser;
    }
    
    public String GetSelectedUserName(){
        return selectedUser.getName();
    }
    
    public boolean SetSelectedUserName(String name){
        selectedUser.setName(name);
        return true;
    }
    
    public boolean SetSelectedUserPassword(String password){
        selectedUser.setPassword(password);
        return true;
    }
    
    public Boolean DeleteSelected(){
        return users.remove(selectedUser);
    }
    
    
}
