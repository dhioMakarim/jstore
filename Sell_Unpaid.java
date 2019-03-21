
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{ 
    
    private InvoiceType INVOICE_TYPE;
    private InvoiceStatus INVOICE_STATUS;
    private String dueDate;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Unpaid(int id,
        Item item,
        String date,
        int totalItem,
        int totalPrice,
        String dueDate)
    {
        super(id, item, date, totalItem, totalPrice);
        
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return InvoiceStatus.Unpaid;
    }
    public InvoiceType getInvoiceType()
    {
        return InvoiceType.Sell;
    }
    public String getDueDate()
    {
        return dueDate;
    }
    public void printData()
    {
        System.out.println("=============SELL_PAID============");
        System.out.println("ID: " + super.getId());
        System.out.println("Tanngal: " + super.getDate());
        System.out.println("Item: " + super.getItem());
        System.out.println("Total Item: " + super.getTotalItem());
        System.out.println("Total Harga: " + super.getTotalPrice());
        System.out.println("Status: " + super.getInvoiceStatus());
        System.out.println("Type: " + super.getInvoiceType());
        System.out.println("Due Date: " + getDueDate());
    }
}