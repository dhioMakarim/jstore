package jstore;
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
import java.text.*;

public class Sell_Installment extends Invoice
{
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");
    
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(ArrayList<Integer> item, int installmentPeriod,
    Customer customer)
    {
        super(item);
        this.installmentPeriod = installmentPeriod;
        super.setIsActive(true);
        this.customer = customer;
    }

    /**
     * An e
     *
     * @param  y 
     * @return    the 
     */
    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    
    /**
     * An e
     *
     * @param  y 
     * @return    the 
     */
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
    
    /**
     * An 
     *
     * @param  y  a sa
     * @return    the 
     */
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
    public void setInstallmentPrice(int totalPrice)
    {
        installmentPrice = (int)(1.02 * (totalPrice / installmentPeriod));
    }
    
    /**
     * An 
     *
     * @param  y  a 
     * @return    th
     */
    public void setTotalPrice(int installmentPeriod)
    {
        int totalPrice = installmentPrice * installmentPeriod;
        super.setTotalPrice(totalPrice);
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
        System.out.println("Installment price = " + installmentPrice);
        System.out.println("Customer ID = " + customer.getId());
        System.out.println("Customer name = " + customer.getName());
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Installment period = " + installmentPeriod);
        System.out.println("Sell success.");
        return "";
    }
}
