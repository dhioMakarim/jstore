package jstore;
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
import java.text.*;

public class Sell_Unpaid extends Invoice
{
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");
    
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.dueDate = new GregorianCalendar();
        this.dueDate.add((GregorianCalendar.DATE), 1);
        this.customer = customer;
        super.setIsActive(true);
    }

    /**
     * An 
     *
     * @param  y  a sa
     * @return    the 
     */
    @Override
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    /**
     * An 
     *
     * @param  y  a 
     * @return    th
     */
    @Override
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    /**
     * An 
     *
     * @param  y  a 
     * @return    th
     */
    public Customer getCustomer()
    {
        return customer;
    }
    
    /**
     * An 
     *
     * @param  y  a 
     * @return    th
     */
    public String getDueDate()
    {
        return dateFormat.format(dueDate.getTime());
    }
    
    /**
     * An 
     *
     * @param  y  a 
     * @return    th
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    /**
     * An 
     *
     * @param  y  a 
     * @return    th
     */
    public void setDueDate(Calendar dueDate)
    {
        this.dueDate = dueDate;
    }
    
    /**
     * Me
     *
     */    
    @Override
    public String toString()
    {
        System.out.println("==========INVOICE==========");
        System.out.println("ID = " + super.getId());
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(super.getId()).getItem();
        for(int tempID : listItemID)
        {
            System.out.println("Item = " + 
            DatabaseItem.getItemFromID(tempID).getName());
            System.out.println("Price = " + 
            DatabaseItem.getItemFromID(tempID).getPrice());
            System.out.println("Supplier ID = " + 
            DatabaseItem.getItemFromID(tempID).getSupplier().getId());
            System.out.println("Supplier name = " + 
            DatabaseItem.getItemFromID(tempID).getSupplier().getName());
        }
        System.out.println("Buy date = " + getDate());
        System.out.println("Price total = " + super.getTotalPrice());
        System.out.println("Customer ID = " + customer.getId());
        System.out.println("Customer name = " + customer.getName());
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Due date = " + getDueDate());
        System.out.println(
        "If payment is not received by dueDate, transaction will be cancelled.");
        return "";
    }
}
