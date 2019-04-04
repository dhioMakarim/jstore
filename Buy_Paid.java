
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(int id, Item item, int totalItem)
    {
        super(id, item, totalItem);

    }
    
    public InvoiceStatus getInvoiceStatus(){
        return this.INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return this.INVOICE_TYPE;
    }
    
    public void printData(){
        System.out.println("============INVOICE BUY_PAID============");
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
