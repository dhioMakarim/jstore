
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
    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(int id, Item item, int totalItem, Customer customer)
    {
        super(id, item, totalItem);
        this.customer = customer;
    }

    public InvoiceStatus getInvoiceStatus(){
        return this.INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return this.INVOICE_TYPE;
    }
    
    public Customer customer()
    {
        return this.customer;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    public void printData(){
        System.out.println("============INVOICE SELL_PAID============");
        System.out.print("INVOICE dan ID");
        System.out.println("");
        System.out.print("ID : ");
        System.out.println(this.getId());
        System.out.print("Total harga : ");
        System.out.println(this.totalPrice);
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