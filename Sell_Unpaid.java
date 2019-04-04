import java.util.*;
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
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(int id, Item item, int totalItem, Customer customer)
    {
        super(id, item, totalItem);
        this.customer = customer;
        this.dueDate = new GregorianCalendar();
        dueDate.add((GregorianCalendar.DATE),1);
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return this.INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return this.INVOICE_TYPE;
    }
    
    public Calendar getDueDate(){
        return this.dueDate;
    }
    
    public Customer getCustomer()
    {
        return this.customer;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    public void setDueDate(Calendar dueDate)
    {
        this.dueDate = dueDate;
    }
    public void printData(){
        System.out.println("============INVOICE SELL_UNPAID============");
        System.out.print("INVOICE dan ID");
        System.out.println("");
        System.out.print("ID : ");
        System.out.println(this.getId());
        System.out.print("Total harga : ");
        System.out.println(this.totalPrice);
        System.out.print("Due Date : ");
        System.out.println(this.dueDate);
        System.out.print("Status: ");
        System.out.println(getInvoiceStatus());
        System.out.print("Type: ");
        System.out.println(getInvoiceType());
    }
    public String toString()
    {
        return super.toString();
    }
}