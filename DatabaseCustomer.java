import java.util.*;
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE;
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public DatabaseCustomer()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static boolean addCustomer(Customer customer)
    {
        for(Customer temp : CUSTOMER_DATABASE) 
        {
            if(temp.getName() == customer.getName() && temp.getEmail() == customer.getEmail()) 
            {
                CUSTOMER_DATABASE.add(customer);
                LAST_CUSTOMER_ID = customer.getId();
                return true;
            }
        }
        return false;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
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
     * remove customer
     * removing customer
     */
    public static boolean removeCustomer(int id)
    {
        for(Customer temp : CUSTOMER_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                CUSTOMER_DATABASE.remove(temp);
                return true;
                
            }
        }
        return false;
    }
}