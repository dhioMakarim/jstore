
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    // instance variables - replace the example below with your own
    private int x;
    private Supplier supplier;
    
    /**
     * Constructor for objects of class Transaction
     */
    public Transaction()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void orderNewItem(Supplier supplier)
    {
        Item barang = new Item(1, "benda", 10, 5000, ItemCategory.Electronics, supplier, ItemStatus.New);
        
        DatabaseItem.addItem(barang);
        
        Invoice pembelian = new Invoice(1, barang, "14-Mar-19", barang.getPrice());
        
        barang.setStatus(ItemStatus.New);
        
        pembelian.setInvoiceStatus(InvoiceStatus.Paid);
        System.out.println("==============ORDER NEW ITEM==============");
        pembelian.printData();
        barang.printData();
        
    }
    public void orderSecondItem(Supplier supplier)
    {
        Item barang = new Item(1, "benda", 10, 5000, ItemCategory.Electronics, supplier, ItemStatus.Second);
        
        DatabaseItem.addItem(barang);
        
        Invoice pembelian = new Invoice(1, barang, "14-Mar-19", barang.getPrice());
        
        barang.setStatus(ItemStatus.Second);
        
        pembelian.setInvoiceStatus(InvoiceStatus.Paid);
        System.out.println("==============ORDER SECOND ITEM==============");
        pembelian.printData();
        barang.printData();
        
    }
    public void orderRefurbishedItem(Supplier supplier)
    {
        Item barang = new Item(1, "benda", 10, 5000, ItemCategory.Electronics, supplier, ItemStatus.Refurbished);
        
        DatabaseItem.addItem(barang);
        
        Invoice pembelian = new Invoice(1, barang, "14-Mar-19", barang.getPrice());
        
        barang.setStatus(ItemStatus.Refurbished);
        
        pembelian.setInvoiceStatus(InvoiceStatus.Paid);
        System.out.println("==============ORDER REFURBISHED ITEM==============");
        pembelian.printData();
        barang.printData();
        
    }
    public void sellItemPaid(Item item)
    {
        Invoice pembelian = new Invoice(1, item, "14-Mar-19", item.getPrice());
        
        pembelian.setInvoiceStatus(InvoiceStatus.Paid);
        
        item.setStatus(ItemStatus.Sold);
        System.out.println("==============ITEM PAID==============");
        pembelian.printData();
    }
    public void sellItemUnpaid(Item item)
    {
        Invoice pembelian = new Invoice(1, item, "14-Mar-19", item.getPrice());
        
        pembelian.setInvoiceStatus(InvoiceStatus.Unpaid);
        
        item.setStatus(ItemStatus.Sold);
        System.out.println("==============ITEM UNPAID==============");
        pembelian.printData();
    }
    public void sellItemInstallment(Item item)
    {
        Invoice pembelian = new Invoice(1, item, "14-Mar-19", item.getPrice());
        
        pembelian.setInvoiceStatus(InvoiceStatus.Installment);
        
        item.setStatus(ItemStatus.Sold);
        System.out.println("==============INSTALLMENT ITEM==============");
        pembelian.printData();
    }
}
