import java.util.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */



public class Customer
{
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;
    
    
    
    public Customer(String name, String email, String username, String password, 
        int id, Calendar birthDate)
    {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = id;
        this.birthDate = birthDate;
    }
    
    public Customer(String name, String email, String username, String password, 
        int id, int year, int month, int dayOfMonth)
    {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = id;
        this.birthDate = new GregorianCalendar (year, month, dayOfMonth);
        
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getEmail()
    {
        return name;
    }
    
    public void setEmail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        Matcher matcher = pat.matcher(email);
        if (matcher.matches())
        {
            this.email = email;
        }
        else 
        {
            this.email = null;
        }
    }
    
    public String getUsername()
    {
        return name;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    public void setPassword(String password)
    {
        String passRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern pat = Pattern.compile(passRegex);
        Matcher matcher = pat.matcher(email);
        if (matcher.matches())
        {
            this.password = password;
        }
        else 
        {
            this.password = null;
        }
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public Calendar getBirthDate()
    {
        SimpleDateFormat format = new SimpleDateFormat ("dd-MM-yyyy");
        String formatted = ("Birth Date: " + format.format(this.birthDate));
        System.out.println(formatted);
        return birthDate;
    }
    
    /*public Calendar getBirthDate()
    {
        System.out.printf("%1$s %2$td %2$tB %2$tY", "Birth Date: ", birthDate);
        return birthDate;
    }*/
    public void setBirthDate(Calendar birthDate)
    {
        this.birthDate = birthDate;
    }
    
    //public void setBirthDate(int year, int month, int dayOfMonth)
    //{
    //    Calendar birthDate = new GregorianCalendar (year, month, dayOfMonth);
    //}
    
    public String toString()
    {
        return name;
    }
}
