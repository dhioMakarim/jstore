
/**
 * Data dari supplier keseluruhan dari toko.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */
public class DatabaseSupplier
{
    // instance variables
    private static Supplier[] listSupplier;
    private static Supplier supplier;

    /**
     * add supplier object
     * @param   supplier   supplier's object
     */
    public static boolean addSupplier(Supplier supplier){
        return true;
    }
    
    /**
     * remove supplier
     * removing supplier
     */
    public static void removeSupplier(Supplier supplier){
    }
    
    /**
     * get supplier object
     * @return      supplier's object
     */
    public static Supplier getSupplier(){
        return supplier;
    }
    
    /**
     * return list of supplier
     * @return      list of the suppliers
     */
    public static Supplier[] getListSupplier(){
        return listSupplier;
    }
}