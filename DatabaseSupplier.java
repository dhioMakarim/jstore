import java.util.*;
/**
 * Data dari supplier keseluruhan dari toko.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */
public class DatabaseSupplier
{
    private static ArrayList<Supplier> SUPPLIER_DATABASE;
    private static int LAST_SUPPLIER_ID = 0;
    
    public DatabaseSupplier()
    {
        // initialise instance variables
    }
    
    /**
     * return list of supplier
     * @return      list of the suppliers
     */
    public static ArrayList<Supplier> getSupplierDatabase(){
        return SUPPLIER_DATABASE;
    }
    
    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }
    
    /**
     * add supplier object
     * @param   supplier   supplier's object
     */
    public static boolean addSupplier(Supplier supplier)
    {
        for(Supplier temp : SUPPLIER_DATABASE) 
        {
            if(temp.getName() == supplier.getName() && temp.getEmail() == supplier.getEmail()
            && temp.getPhoneNumber() == supplier.getPhoneNumber()) 
            {
                SUPPLIER_DATABASE.add(supplier);
                LAST_SUPPLIER_ID = supplier.getId();
                return true;
            }
        }
        return false;
    }
    
    /**
     * get supplier object
     * @return      supplier's object
     */
    public static Supplier getSupplier(int id){
        for(Supplier temp : SUPPLIER_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                return temp;
            }
        }
        return null;
    }
    
    /**
     * remove supplier
     * removing supplier
     */
    public static boolean removeSupplier(int id)
    {
        for(Supplier temp : SUPPLIER_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                DatabaseItem.getItemFromSupplier(temp).clear();
                return true;
                
            }
        }
        return false;
    }
    
}