
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    // instance variables - replace the example below with your own
    private int x;
    private Item item;
    
    /**
     * Constructor for objects of class Transaction
     */
    public Transaction()
    {
        // initialise instance variables
        x = 0;
    }

    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void orderNewItem(Item item)
    {
        Invoice obj1 = new Buy_Paid(1, item, "21-03-2019", 10, item.getPrice());
        if(obj1 instanceof Sell_Paid)
        {
            System.out.println("Benar, Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bukan Sell_Paid");
        }
        System.out.println("--------ORDER NEW ITEM---------");
        obj1.printData();
        item.printData();
    }
    public void orderSecondItem(Item item)
    {
        Invoice obj2 = new Buy_Paid(2, item, "21-03-2019", 11, item.getPrice());
               
        System.out.println("--------ORDER SECOND ITEM---------");
        obj2.printData();
        item.printData();
    }
    public void orderRefurbishedItem(Item item)
    {
        Invoice obj3 = new Buy_Paid(3, item, "21-03-2019", 12, item.getPrice());
        
        System.out.println("--------ORDER REFURBISHED ITEM---------");
        obj3.printData();
        item.printData();
    }
    public void sellItemPaid(Item item)
    {
        Invoice obj4 = new Sell_Paid(1, item, "21-03-2019", 14, item.getPrice());
        
        System.out.println("--------PAID ITEM---------");
        obj4.printData();
        item.printData();
    }
    public void sellItemUnpaid(Item item)
    {
        Invoice obj5 = new Sell_Unpaid(2, item, "21-03-2019", 14, item.getPrice(), "30-03-2019");
        
        System.out.println("--------UNPAID ITEM---------");
        obj5.printData();
        item.printData();
    }
    public void sellItemInstallment(Item item)
    {
        Invoice obj6 = new Sell_Installment(3, item, "21-03-2019", 14, item.getPrice(), 5);
        
        System.out.println("--------INSTALLMENT ITEM---------");
        obj6.printData();
        item.printData();
    }
}
