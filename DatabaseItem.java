
/**
 * Database item yg di toko.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */
public class DatabaseItem
{
    // instance variables - replace the example below with your own
    
    private String[] listItem;
    private static Item itemDB;
    
    /**
     * Constructor untuk objects dari class DatabaseItem
     */
    public DatabaseItem()
    {
        // initialise instance variables
        
    }
    public static boolean addItem(Item item)
    {
        itemDB = item;
        return false;
    }
    public boolean removeItem(Item item)
    {
        return false;
    }
    public static Item getItem()
    {
        return itemDB;
    }
    public String[] getItemDatabase()
    {
        return listItem;
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
        return  y;
    }
}
