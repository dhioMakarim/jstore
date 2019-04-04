
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
  
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(int id, Item item, int totalItem, int installmentPeriod, Customer customer)
    {
        super(id, item, totalItem);
        this.customer = customer;
    }
    
    public int getInstallmentPeriod(){
        return this.installmentPeriod;
    }
        
    public int getInstallmentPrice(){
        return this.installmentPrice;
    }
        
    public InvoiceStatus getInvoiceStatus(){
        return this.INVOICE_STATUS;
    }
        
    public InvoiceType getInvoiceType(){
        return this.INVOICE_TYPE;
    }
        
    public void setInstallmentPrice(int installmentPrice){
        double div = 1.02;
        this.installmentPrice = (int)(installmentPrice/this.installmentPeriod*div);
    }
        
    public void setTotalPrice(int totalPrice){
        this.totalPrice = this.installmentPrice * this.installmentPeriod;
    }
    
    public Customer getCustomer()
    {
        return this.customer;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    public void printData(){
        System.out.println("============INVOICE SELL_INSTALLMENT============");
        System.out.print("INVOICE dan ID");
        System.out.println("");
        System.out.print("ID : ");
        System.out.println(this.getId());
        System.out.print("Total harga : ");
        System.out.println(this.totalPrice);
        System.out.print("Total installment : ");
        System.out.println(this.installmentPrice);
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