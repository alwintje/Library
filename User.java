
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class User
{
    // instance variables - replace the example below with your own
    private String name;
    private String password;

    public User(String name, String password)
    {
        this.name = name;
        this.password = password;
    }

    public String getName()
    {
        // put your code here
        return name;
    }
}
