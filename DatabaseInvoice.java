
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseInvoice
{
    private Invoice[] listInvoice;
    private static Invoice invoice;
    
    public DatabaseInvoice()
    {
        
    }
    
    public static boolean addInvoice(Invoice invoice)
    {
        return false;
    }
    
    public static void removeInvoice(Invoice invoice)
    {
        
    }
    
    public Invoice getInvoice()
    {
        return invoice;
    }
    
    public Invoice[] getListInvoice()
    {
        return listInvoice;
    }
}
