
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

    public boolean isLoggedInUserAutorisedTo(String action){
        if(loggedInUser == null) return false;
        return loggedInUser.authorisedTo(action);
    }

    public boolean createUser(String Role, String name, String password){

        if(loggedInUser == null ){
            users.add(new Member("Name","Password"));
        }else if(this.isLoggedInUserAutorisedTo("create_user")){
            if(Role.equals("Employee")){
                users.add(new Employee("Name","Password"));
            }else if(Role.equals("Acountant")){
                users.add(new Accountant("Name","Password"));
            }else if(Role.equals("Member")){
                users.add(new Member("Name","Password"));
            }
        }else{
            return false;
        }
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

    public boolean login(String name, String password){
        for(User user :  users){
            if (user.getName().equals(name) && user.getPassword().equals(password)){
                loggedInUser = user;
                return true;
            }
        }
        return false;
    }

    public boolean logout(){
        loggedInUser = null;
        return true;
    }

    public User getLoggedInUser(){
        return loggedInUser;
    }

    public User getSelectedUser(){
        return selectedUser;
    }

    public String getSelectedUserName(){
        if(selectedUser == null) return "No user selected";
        return selectedUser.getName();
    }

    public String getLoggedInUserName(){
        if(loggedInUser == null) return "No user logged in";
        return loggedInUser.getName();
    }

    public boolean setSelectedUserName(String name){
        if(selectedUser == null) return false;
        selectedUser.setName(name);
        return true;
    }

    public boolean setSelectedUserPassword(String password){
        if(selectedUser == null) return false;
        selectedUser.setPassword(password);
        return true;
    }

    public boolean deleteSelected(){
        if(selectedUser == null) return false;
        return users.remove(selectedUser);
    }
}
