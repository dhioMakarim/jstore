package jstore;

import java.text.*;
import java.util.*;
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive = false;
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");
    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return this.INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return this.INVOICE_TYPE;
    }
    
    public Customer customer()
    {
        return customer;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    
    public String toString()
    {
        String string="ID = " + super.getId();
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(super.getId()).getItem();
        for (int tempID : listItemID)
        {
            string += "\nItem: " +
            DatabaseItem.getItemFromID(tempID).getName();
            string += "\nPrice = " +
            DatabaseItem.getItemFromID(tempID).getPrice();
            string += "\nSupplier ID = " +
            DatabaseItem.getItemFromID(tempID).getSupplier().getId();
            string += "\nSupplier Name = " +
            DatabaseItem.getItemFromID(tempID).getSupplier().getName();
        }
        string += "\nBuy date = " + dateFormat.format(super.getDate().getTime());
        string += "\nPrice total = " + super.getTotalPrice();
        string += "\nCustomer ID = " + customer.getId();
        string += "\nCustomer name = " + customer.getName();
        string += "\nStatus = " + this.getInvoiceStatus();
        string += "\nSell success.";
        return string;
    }
}