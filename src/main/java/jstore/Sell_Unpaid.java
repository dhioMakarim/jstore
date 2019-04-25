package jstore;

import java.util.*;
import java.text.*;
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive = true;
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer = customer;
        this.dueDate = new GregorianCalendar();
        dueDate.add((GregorianCalendar.DATE),1);
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return this.INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return this.INVOICE_TYPE;
    }
    
    public Calendar getDueDate()
    {
        return this.dueDate;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    public void setDueDate(Calendar dueDate)
    {
        this.dueDate = dueDate;
    }
    
    public String toString()
    {
        System.out.println("ID = " + super.getId());
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(super.getId()).getItem();
        for (int tempID : listItemID)
        {
            System.out.println("Item = " +
            DatabaseItem.getItemFromID(tempID).getName());
            System.out.println("Price = " +
            DatabaseItem.getItemFromID(tempID).getPrice());
            System.out.println("Supplier ID = " +
            DatabaseItem.getItemFromID(tempID).getSupplier().getId());
            System.out.println("Supplier Name = " +
            DatabaseItem.getItemFromID(tempID).getSupplier().getName());
        }
        System.out.println("Buy date = " + dateFormat.format(super.getDate().getTime()));
        System.out.println("Price total = " + super.getTotalPrice());
        System.out.println("Customer ID = " + customer.getId());
        System.out.println("Customer name = " + customer.getName());
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Due date = " + dateFormat.format(dueDate));
        System.out.println(
        "If payment is not received by dueDate, transaction will be cancelled.");
        return "";
    }
}