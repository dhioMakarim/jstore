package jstore;
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID = 0;

    /**
     * Constructor for objects of class DatabaseInvoice
     */
    public DatabaseInvoice()
    {
        // initialise instance variables
    }
    
    /**
     * Method untuk mengembalikan supplier
     *
     * @return    objek supplier
     */
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }
    
    /**
     * Method untuk mengembalikan list supplier
     *
     * @return    list supplier
     */
    public static int getLastInvoiceID()
    {
        return LAST_INVOICE_ID;
    }
    
    /**
     * Method untuk menambahkan supplier kedalam list
     *
     * @return    false
     */
    public static boolean addInvoice(Invoice invoice)throws InvoiceAlreadyExistsException
    {
        for(Invoice temp : INVOICE_DATABASE)
        {
            if((temp.getItem() == invoice.getItem()) &&
                    (temp.getCustomer() == invoice.getCustomer()))
            {
                throw new InvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID = invoice.getId();
        return true;
    }
    
    /**
     * Method untuk mengembalikan supplier
     *
     * @return    objek supplier
     */
    public static Invoice getInvoice(int id)
    {
        for(Invoice temp : INVOICE_DATABASE) 
        {
            if(temp.getId() == id)
            {
                return temp;
            }
        }
        return null;
    }
    
    /**
     * Method untuk mengembalikan supplier
     *
     * @return    objek supplier
     */
    public static ArrayList<Invoice> getActiveOrder(Customer customer)throws CustomerDoesntHaveActiveException
    {
        ArrayList<Invoice> list = new ArrayList<Invoice>();
        boolean found = false;
        for(Invoice temp : INVOICE_DATABASE)
        {
            if(temp.getCustomer() == customer &&
                temp.getIsActive() == true)
            {
                list.add(temp);
                found = true;
            }
        }
        if(found)
        {
            return list;
        }
        else
        {
            throw new CustomerDoesntHaveActiveException(customer);
        }
    }
        
    /**
     * Method untuk menghapus supplier dari list
     *
     */
    public static boolean removeInvoice(int id)throws InvoiceNotFoundException
    {
        for(Invoice temp : INVOICE_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                if(temp.getIsActive() == true) 
                {
                    temp.setIsActive(false);
                }
                INVOICE_DATABASE.remove(temp);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
}
