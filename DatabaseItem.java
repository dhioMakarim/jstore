
/**
 * Database item yg di toko.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */
public class DatabaseItem
{
    // instance variables
    private Item[] listItem;
    public Item itemDB;

    /**
     * Constructor for objects of class DatabaseItem
     */
    public DatabaseItem()
    {
        
    }
    
    /**
     * set item's object
     * @param   item    item object   
     */
    public boolean addItem(Item item){
        return true;
    }
    
    /**
     * remove item
     * @return      whether item is remove successfully or not
     */
    public boolean removeItem(Item item){
        return true;
    }
    
    /**
     * get item's object
     * @return      one of the item's object
     */
    public Item getItem(){
        return itemDB;
    }
    
    /**
     * get all items
     * @return      all list of the items
     */
    public Item[] getItemDatabase(){
        return listItem;
    }
}