import java.util.*;
/**
 * Database item yg di toko.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */
public class DatabaseItem
{
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<Item>();
    private static int LAST_ITEM_ID = 0;
    

    /**
     * Constructor for objects of class DatabaseItem
     */
    public DatabaseItem()
    {
        // initialise instance variables
    }
    
    /**
     * get all items
     * @return      all list of the items
     */
    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    
    public static int getLastItemID()
    {
        return LAST_ITEM_ID;
    }
    
    /**
     * set item's object
     * @param   item    item object   
     */
    public static boolean addItem(Item item)
    {
        for(Item temp : ITEM_DATABASE) 
        {
            if(temp.getName() == item.getName() && temp.getStatus() == item.getStatus() && temp.getSupplier() == item.getSupplier()) 
            {
                return false;
            }
        }
        ITEM_DATABASE.add(item);
        LAST_ITEM_ID = item.getId();
                return true;
    }
    
       
    /**
     * get item's object
     * @return      one of the item's object
     */
    public static Item getItemFromID(int id)
    {
        for(Item temp : ITEM_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                return temp;
            }
        }
        return null;
    }
    
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> list = new ArrayList<Item>();
        boolean found = false;
        for (Item temp : ITEM_DATABASE)
        {
            if(temp.getSupplier() == supplier)
            {
                list.add(temp);
                found = true;
            }
        }
        if (found)
        {
            return list;
        }
        else 
        {
            return null;
        }
    }
    
    public static ArrayList<Item> getItemFromCategory(ItemCategory category)
    {
        ArrayList<Item> list = new ArrayList<Item>();
        boolean found = false;
        for (Item temp : ITEM_DATABASE)
        {
            if(temp.getCategory() == category)
            {
                list.add(temp);
                found = true;
            }
        }
        if (found)
        {
            return list;
        }
        else 
        {
            return null;
        }
    }
    
    public static ArrayList<Item> getItemFromStatus(ItemStatus status)
    {
        ArrayList<Item> list = new ArrayList<Item>();
        boolean found = false;
        for (Item temp : ITEM_DATABASE)
        {
            if(temp.getStatus() == status)
            {
                list.add(temp);
                found = true;
            }
        }
        if (found)
        {
            return list;
        }
        else 
        {
            return null;
        }
    }
    
    public static boolean removeItem(int id)
    {
        for(Item temp : ITEM_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                
                ITEM_DATABASE.remove(temp);
                return true;
                
            }
        }
        return false;
    }
    
}