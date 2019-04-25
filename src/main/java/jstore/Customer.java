package jstore;

import java.util.*;
import java.text.*;
import java.util.regex.*;
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yy");
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username, String password,
                    Calendar birthDate)
    {
        this.name  = name;
        this.email  = email;
        this.username = username;
        this.password = password;
        this.birthDate = birthDate;
        id = DatabaseCustomer.getLastCustomerID() + 1;
    }
    public Customer(String name, String email, String username, String password,
                    int year, int month, int dayOfMonth)
    {
        this.name  = name;
        this.email  = email;
        this.username = username;
        this.password = password;
        this.birthDate = new GregorianCalendar(year, month, dayOfMonth);
        id = DatabaseCustomer.getLastCustomerID() + 1;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public int getId()
    {
        return id;
    }
    public Calendar getBirthDate()
    {
        SimpleDateFormat ft = new SimpleDateFormat("dd MMMMMMMMMMMMMM YYY");
        // System.out.println("Birth Date:" + ft.format(birthDate.getTime()));
        // return birthDate;
        System.out.printf("%1$s %2$td %2$tB %2$tY", "Birth date:", birthDate);
        return birthDate;
    }
    public void setName(String name)
    {
        this.name  = name;
    }
    public void setEmail(String email)
    {
        String pattern =  "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if (m.find()) {
            System.out.println("Email : " + m.group ());
            this.email  = email;
        } else {
            System.out.println("Email : null");
            this.email  = email;
        }
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public void setPassword(String password)
    {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        if(m.find()){
            System.out.println("Password: " + m.group ());
            this.password = password;
        }else{
            System.out.println("Password: NULL");
            this.password = "NULL";
        }
    }
    public void setId(int id)
    {
        this.id  = id;
    }
    public void setBirthDate(Calendar birthDate)
    {
        this.birthDate = birthDate;
    }
    public void setBirthDate(int year, int month, int dayOfMonth)
    {
    }
    public String toString()
    {
        System.out.println("==========CUSTOMER==========");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("ID: " + id);
        System.out.println("Birthdate: " + birthDate.getTime());
        return "";
    }
}