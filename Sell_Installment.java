
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    private int installmentPeriod;
    private int installmentPrice;
    private InvoiceType INVOICE_TYPE;
    private InvoiceStatus INVOICE_STATUS;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Installment(int id,
        Item item,
        String date,
        int totalItem,
        int totalPrice,
        int installmentPeriod)
    {
        super(id, item, date, totalItem, totalPrice);
        
    }
    
    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
    public InvoiceStatus getInvoiceStatus()
    {
        return InvoiceStatus.Installment;
    }
    public InvoiceType getInvoiceType()
    {
        return InvoiceType.Sell;
    }
    public void setInstallmentPrice()
    {
        this.installmentPrice = (((totalPrice/installmentPeriod)*102)/100);
    }
    public void setTotalPrice()
    {
        this.totalPrice = installmentPrice*installmentPeriod;
    }
    public void printData()
    {
        System.out.println("=============SELL_INSTALLMENT============");
        System.out.println("ID: " + super.getId());
        System.out.println("Tanngal: " + super.getDate());
        System.out.println("Item: " + super.getItem());
        System.out.println("Total Item: " + super.getTotalItem());
        System.out.println("Total Harga: " + super.getTotalPrice());
        System.out.println("Status: " + super.getInvoiceStatus());
        System.out.println("Type: " + super.getInvoiceType());
        System.out.println("Installment Price: " + getInstallmentPrice());
    }
}
