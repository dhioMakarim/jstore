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
    private int id;
    private String name;
    private String email;
    private String username;
    private String password;
    private Calendar birthDate;
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username, String password,
                    Calendar birthDate)
    {
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.birthDate = birthDate;
    }

    public Customer(String name, String email, String username, String password,
                    int year, int month, int dayOfMonth)
    {
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.birthDate = new GregorianCalendar(year, (month-1), dayOfMonth);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        return id;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getBirthDate()
    {
        return dateFormat.format(birthDate.getTime());
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
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

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setUsername(String username)
    {
        this.username = username;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
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

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setBirthdate(Calendar birthDate)
    {
        this.birthDate = birthDate;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setBirthdate(int year, int month, int dayOfMonth)
    {
        birthDate = new GregorianCalendar(year, (month-1), dayOfMonth);
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