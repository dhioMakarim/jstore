
/**
 * Write a description of class JStore here.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */
public class JStore
{
    // instance variables - replace the example below with your own
    private int x;
    
    
    
    public static void main(String[] args)
    {
        Location rumah = new Location("Jawa Barat", "di jawa bagian barat", "Depok");
        Supplier mbuh = new Supplier(02, "Dhio", "dhio.makarim@gmail.com", "087889871914", rumah);
        Item helep = new Item(02, "namaitem", 10, 12000, ItemCategory.Electronics, ItemStatus.New, mbuh);
        
        rumah.printData();
        mbuh.printData();
        DatabaseItem.addItem(helep);
        Transaction transaksi = new Transaction();
        transaksi.orderNewItem(DatabaseItem.getItem());
        //transaksi.orderSecondItem(DatabaseItem.getItem());
        //transaksi.orderRefurbishedItem(DatabaseItem.getItem());
        transaksi.sellItemPaid(DatabaseItem.getItem());
        transaksi.sellItemUnpaid(DatabaseItem.getItem());
        transaksi.sellItemInstallment(DatabaseItem.getItem());
        //Item opoiki = new Item(02, "sebuah benda", 10, 14000, "benda nyata", mbuh);
        //Invoice helep = new Invoice(02, opoiki, "06/03/2019", 28000);
        //mbuh.printData();
        //mbuh.setName("Fariz");
        //mbuh.printData();
        //opoiki.printData();
        //DatabaseItem.addItem(opoiki);
    }
    /**
     * Constructor for objects of class JStore
     */
    public JStore()
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
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
