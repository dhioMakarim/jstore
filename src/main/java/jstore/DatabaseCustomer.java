package jstore;

import java.util.*;
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public DatabaseCustomer()
    {
        // initialise instance variables
    }


    /**
     * Method untuk mengembalikan list supplier
     *
     * @return    list supplier
     */
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    /**
     * Method untuk mengembalikan supplier
     *
     * @return    objek supplier
     */
    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     //     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static boolean addCustomer(Customer customer)throws CustomerAlreadyExistsException
    {
        boolean found = false;
        for(Customer temp : CUSTOMER_DATABASE)
        {
            if(temp.getName() == customer.getName() || temp.getEmail()
                    == customer.getEmail())
            {
                throw new CustomerAlreadyExistsException(customer);
            }
        }
        CUSTOMER_DATABASE.add(customer);
        LAST_CUSTOMER_ID = customer.getId();
        return true;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     //     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static Customer getCustomer(int id)
    {
        for(Customer temp : CUSTOMER_DATABASE)
        {
            if(temp.getId() == id)
            {
                return temp;
            }
        }
        return null;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     //     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static boolean removeCustomer(int id)throws CustomerNotFoundException
    {
        for(Customer temp : CUSTOMER_DATABASE)
        {
            if(temp.getId() == id)
            {
                CUSTOMER_DATABASE.remove(temp);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    }

    public static Customer getCustomerLogin(String email, String password){
        for(Customer temp : CUSTOMER_DATABASE)
        {
            if(temp.getEmail().equals(email) && temp.getPassword().equals(password))
            {
                return temp;
            }
        }
        return null;
    }
}