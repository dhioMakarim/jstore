import java.util.*; 
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Transaction
{
    private static ArrayList<Integer> listItem = new ArrayList<Integer>();
    private static Buy_Paid order;
    private static Sell_Paid sellPaid;
    private static Sell_Unpaid sellUnpaid;
    private static Sell_Installment sellInstall;
    
    /**
     * Constructor for objects of class Transaction
     */
    public Transaction()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderNewItem(Item item)
    {
        listItem.add(item.getId());
        order = new Buy_Paid(listItem);
        DatabaseInvoice.addInvoice(order);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderSecondItem(Item item)
    {
        listItem = DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID()).getItem();
        listItem.add(item.getId());
        order.setItem(listItem);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderRefurbishedItem(Item item)
    {
        listItem = DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID()).getItem();
        listItem.add(item.getId());
        order.setItem(listItem);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemPaid(Item item, Customer customer)
    {
        listItem.add(item.getId());
        sellPaid = new Sell_Paid(listItem, customer);
        DatabaseInvoice.addInvoice(sellPaid);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemUnpaid(Item item, Customer customer)
    {
        listItem.add(item.getId());
        sellUnpaid = new Sell_Unpaid(listItem, customer);
        DatabaseInvoice.addInvoice(sellUnpaid);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemInstallment(Item item, Customer customer, 
    int installmentPeriod)
    {
        listItem.add(item.getId());
        sellInstall = new Sell_Installment(listItem, installmentPeriod, customer);
        DatabaseInvoice.addInvoice(sellInstall);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static boolean finishTransaction(Invoice invoice)
    {
        invoice = DatabaseInvoice.getInvoice(invoice.getId());
        if(invoice == null)
        {
            return false;
        }
        invoice.setIsActive(false);
        System.out.println("isActive : " + invoice.getIsActive());
        return true;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static boolean cancelTransaction(Invoice invoice)
    {
        invoice = DatabaseInvoice.getInvoice(invoice.getId());
        if(invoice == null)
        {
            return false;
        }
        DatabaseInvoice.removeInvoice(invoice.getId());
        return true;
    }
}
