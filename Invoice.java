
/**
 * Data invoice dari toko.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */
public abstract class Invoice
{
    private int id;
    private Item item;
    private String date;
    private int totalItem;
    protected int totalPrice;
    
    private InvoiceStatus status;
    private InvoiceType type;

    /**
     * Constructor untuk object dari class Invoice
     */
    public Invoice(int id,
        Item item,
        String date,
        int totalItem,
        int totalPrice)
    {
        this.id=id;
        this.item=item;
        this.date=date;
        this.totalItem=totalItem;
        this.totalPrice=totalPrice;
        this.status=status;
        this.type=type;
    }
    /**
     * Metode untuk mendapatkan id invoice
     */
    public int getId()
    {
        return id;
    }
    /**
     * Metode untuk mendapatkan barang yang diinvoice
     * Menyambung ke class Item
     */
    public Item getItem()
    {
        return item;
    }
    /**
     * Metode untuk mendapatkan tanggal invoice
     */
    public String getDate()
    {
        return date;
    }
    /**
     * Metode untuk mendapatkan total harga yang diinvoice
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    /**
     * Metode untuk mendapatkan total harga yang diinvoice
     */
    public int getTotalItem()
    {
        return totalItem;
    }
    /**
     * Metode untuk mendapatkan total harga yang diinvoice
     */
    public InvoiceStatus getInvoiceStatus()
    {
        return status;
    }
    public InvoiceType getInvoiceType()
    {
        return type;
    }
    /**
     * Metode untuk mengisi id invoice
     */
    public void setId(int id)
    {
        this.id=id;
    }
    /**
     * Metode untuk mengisi barang yang diinvoice
     * Menyambung ke class Item
     */
    public void setItem(Item item)
    {
        this.item=item;
    }
    /**
     * Metode untuk mengisi tanggal invoice
     */
    public void setDate(String date)
    {
        this.date=date;
    }
    /**
     * Metode untuk mengisi total harga yang diinvoice
     */
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice=totalPrice;
    }
    public void setTotalItem(int totalItem)
    {
        this.totalItem=totalItem;
    }
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status=status;
    }
    /**
     * Metode untuk mencetak jumlah harga total
     * 
     */
    public abstract void printData();
    /*{
        System.out.println("=============INVOICE============");
        System.out.println("ID: " + id);
        System.out.println("Tanngal: " + date);
        System.out.println("Item: " + item.getName());
        System.out.println("Total Item: " + totalItem);
        System.out.println("Total Harga: " + totalPrice);
        System.out.println("Status: " + status);
        System.out.println("Type: " + type);
    }*/

}
