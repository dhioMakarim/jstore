
/**
 * Data item yang di toko.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */
public class Item
{
    private int id;
    private String name;
    private int stock;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;
       
    /**
     * Constructor untuk object dari class Item
     */
    public Item(int id,
        String name,
        int stock,
        int price,
        ItemCategory category,
        ItemStatus status,
        Supplier supplier)
    {
        this.id=id;
        this.name=name;
        this.stock=stock;
        this.price=price;
        this.category=category;
        this.status=status;
        this.supplier=supplier;        
    }
    
    /**
     * Metode untuk mendapatkan id barang
     */
    public int getId()
    {
        return id;
    }
    /**
     * Metode untuk mendapatkan nama barang
     */
    public String getName()
    {
        return name;
    }
    /**
     * Metode untuk mendapatkan stok barang
     */
    public int getStock()
    {
        return stock;
    }
    /**
     * Metode untuk mendapatkan harga barang
     */
    public int getPrice()
    {
        return price;
    }
    /**
     * Metode untuk mendapatkan kategori barang
     */
    public ItemCategory getCategory()
    {
        return category;
    }
    /**
     * Metode untuk mendapatkan kategori barang
     */
    public ItemStatus getStatus()
    {
        return status;
    }
    /**
     * Metode untuk mendapatkan supplier barang
     * Menyambung ke class Supplier
     */
    public Supplier getSupplier()
    {
        return supplier;
    }
    /**
     * Metode untuk mengisi id barang
     */
    public void setId(int id)
    {
        this.id=id;
    }
    /**
     * Metode untuk mengisi nama barang
     */
    public void setName(String name)
    {
        this.name=name;
    }
    /**
     * Metode untuk mengisi stok barang
     */
    public void setStock(int stock)
    {
        this.stock=stock;
    }
    /**
     * Metode untuk mengisi harga barang
     */
    public void setPrice(int price)
    {
        this.price=price;
    }
    /**
     * Metode untuk mengisi kategori barang
     */
    public void setCategory(ItemCategory category)
    {
        this.category=category;
    }
    public void setStatus(ItemStatus status)
    {
        this.status=status;
    }
    /**
     * Metode untuk mengisi supplier barang
     * Menyambung ke class Supplier
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;   
    }
    /**
     * Metode untuk mencetak nama item
     * 
     */
    public void printData()
    {
        System.out.println("==============ITEM==============");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Stok: " + stock);
        System.out.println("Kategori: " + category);
        System.out.println("Status: " + status);
        System.out.println("Supplier: " + supplier.getName());
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
        return y;
    }
}
