
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    
    private InvoiceType INVOICE_TYPE;
    private InvoiceStatus INVOICE_STATUS;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(int id,
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
        return InvoiceType.Buy;
    }
    public void printData()
    {
        System.out.println("=============BUY_PAID============");
        System.out.println("ID: " + super.getId());
        System.out.println("Tanngal: " + super.getDate());
        System.out.println("Item: " + super.getItem());
        System.out.println("Total Item: " + super.getTotalItem());
        System.out.println("Total Harga: " + super.getTotalPrice());
        System.out.println("Status: " + super.getInvoiceStatus());
        System.out.println("Type: " + super.getInvoiceType());
    }
}
