import java.util.*;
/**
 * Data invoice dari toko.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */


public abstract class Invoice
{
    // instance variables
    private int id;
    private Item item;
    private Calendar date;
    protected int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    private InvoiceType type;
    /**
     * Constructor for objects of class Invoice
     */
    //public Invoice(int id, Item item, Calendar date, int totalPrice, int totalItem,
    //    InvoiceStatus status, InvoiceType type)
    public Invoice(int id, Item item, int totalItem)
    {
       this.id = id;
       this.item = item;
       //this.date = date;
       //this.totalPrice = totalPrice;
       this.totalItem = totalItem;
       this.status = status;
       this.totalPrice = totalItem * item.getPrice();
    }

    
    /**
     * get invoice id
     * @return      invoice's id
     */
    public int getId() 
    {
        return id;
    }

    /**
     * set invoice id
     * @param   id   invoice's id
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * get invoice item
     * @return      item's object
     */
    public Item getItem() 
    {
        return item;
    }

    /**
     * set invoice item
     * @param   item   invoice's item
     */
    public void setItem(Item item)
    {
        this.item = item;
    }

    /**
     * get invoice date
     * @return      invoice's date
     */
    public Calendar getDate()
    {
        return date;
    }

    /**
     * set invoice date
     * @param   date   invoice's date
     */
    public void setDate(Calendar date) 
    {
        this.date = date;
    }

    /**
     * get invoice total price
     * @return      invoice's total price
     */
    public int getTotalPrice() 
    {
        return totalPrice;
    }

    /**
     * set invoice total price
     * @param   totalPrice   invoice's total price
     */
    public void setTotalPrice(int totalPrice) 
    {
        this.totalPrice = totalPrice;
    }
    
    public int getTotalItem()
    {
        return totalItem;
    }

    /**
     * set invoice total price
     * @param   totalPrice   invoice's total price
     */
    public void setTotalItem(int totalItem)
    {
        this.totalItem = totalItem;
    }
    
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();
    
    /**
     * set invoice total price
     * @param   totalPrice   invoice's total price
     */
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }
    
    /**
     * print all total price
     */
    public abstract void printData();
    
    public String toString()
    {
        return super.toString();
    }
    
}