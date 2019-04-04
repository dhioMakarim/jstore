
/**
 * Data item yang di toko.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */
public class Item
{
    // instance variables
    private int id;
    private String name;
    private int stock;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;
    
    /**
     * Constructor for objects of class Item
     */
    public Item(int id, String name, int stock, ItemStatus status,
        int price, ItemCategory category, Supplier supplier)
    {
       // initialise instance variables
       this.id = id;
       this.stock = stock;
       this.price = price;
       this.status = status;
       this.name = name;
       this.category = category;
       this.supplier = supplier;
    }

    /**
     * get item's id
     * @return      item's id
     */
    public int getId() {
        return id;
    }

    /**
     * set item's id
     * @param   id   item's id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get item's name
     * @return      item's name
     */
    public String getName() {
        return name;
    }

    /**
     * set item's name
     * @param   name    item's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get item's stock
     * @return      item's number of stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * set item's stock
     * @param   stock    number of item's stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * get price's item
     * @return      price of the item
     */
    public int getPrice() {
        return price;
    }

    /**
     * set price of the item
     * @param   price    price of the item
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * get item's category name
     * @return      item's category name
     */
    public ItemCategory getCategory() {
        return category;
    }

    /**
     * set item category
     * @param   category    category of the item
     */
    public void setCategory(ItemCategory category) {
        this.category = category;
    }
    
    /**
     * get supplier object
     * @param   supplier    supplier from the Supplier object
     */
    public void setSupplier(Supplier supplier){
        this.supplier = supplier;
    }
    
    /**
     * set item's supplier
     * @return      item's supplier object
     */
    public Supplier getSupplier(){
        return supplier;
    }
    
    public void setStatus(ItemStatus status){
        this.status = status;
    }
    
    /**
     * set item's supplier
     * @return      item's supplier object
     */
    public ItemStatus getStatus(){
        return status;
    }
    
    /**
     * print name of the item
     */
    public void printData(){
        //print Item name
        System.out.println("============ITEM============");
        System.out.print("ITEM dan ID");
        System.out.println("");
        System.out.print("Nama : ");
        System.out.println(this.name);
        System.out.print("Stok : ");
        System.out.println(this.stock);
        System.out.print("Kategory : ");
        System.out.println(this.category);
        System.out.print("Status : ");
        System.out.println(this.status.toString());
        System.out.print("Supplier : ");
        System.out.println(this.supplier.getName());
    }
}