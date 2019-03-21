
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    
    private InvoiceType INVOICE_TYPE;
    private InvoiceStatus INVOICE_STATUS;

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(int id,
        Item item,
        String date,
        int totalItem,
        int totalPrice)
    {
        super(id, item, date, totalItem, totalPrice);
        
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return InvoiceStatus.Paid;
    }
    public InvoiceType getInvoiceType()
    {
        return InvoiceType.Sell;
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
    }
}