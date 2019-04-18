import java.util.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.regex.*;
import java.text.*;
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
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");
    
    
    public Customer(String name, String email, String username, String password, Calendar birthDate)
    {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.birthDate = birthDate;
    }
    
    public Customer(String name, String email, String username, String password, int year, int month, int dayOfMonth)
    {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.birthDate = new GregorianCalendar (year, (month-1), dayOfMonth);
        
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
        if(Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$", email))
        {
            this.email = email;
        }
        else
        {
            this.email = "";
        }
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$", password))
        {
            this.password = password;
        }
        else
        {
            this.password = "";
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
    
    public void setBirthdate(int year, int month, int dayOfMonth)
    {
        birthDate = new GregorianCalendar(year, (month-1), dayOfMonth);
    }
    
    public String toString()
    {
        return "==========CUSTOMER==========" +
        "\nName: " + name +
        "\nEmail: " + email +
        "\nUsername: " + username +
        "\nPassword: " + password +
        "\nID: " + id +
        "\nBirthdate: " + birthDate;
        
    }
}
