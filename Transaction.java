
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*; 

public class Transaction
{
    // instance variables - replace the example below with your own
    private DatabaseItem databaseItem;

    public Transaction(DatabaseItem databaseItem){
        this.databaseItem = databaseItem;
    }
    
    public void orderNewItem(Item item){
        Date d1 = new Date();
        
        Invoice buy_paid1 = new Buy_Paid(87, item, d1.toString(), 1, item.getPrice());
        System.out.println("==========================");
        if (buy_paid1 instanceof Sell_Paid) {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else {
           System.out.println("Salah,Invoice Type bukan Sell _Paid"); 
        }
        buy_paid1.printData();
        item.printData();
    }
    
    public void orderSecondItem(Item item1){
        Date d1 = new Date();
        
        item1.setStatus(ItemStatus.Second);
        
        Invoice buy_paid1 = new Buy_Paid(89, item1, d1.toString(), 1, item1.getPrice());
        System.out.println("==========================");
        if (buy_paid1 instanceof Sell_Paid) {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else {
           System.out.println("Salah,Invoice Type bukan Sell _Paid"); 
        }
    }
    
    public void orderRefurbishedItem(Item item1){
        Date d1 = new Date();
        
        item1.setStatus(ItemStatus.Refurbished);
        
        Invoice buy_paid1 = new Buy_Paid(96, item1, d1.toString(), 1, item1.getPrice());
        System.out.println("==========================");
        if (buy_paid1 instanceof Sell_Paid) {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else {
           System.out.println("Salah,Invoice Type bukan Sell _Paid"); 
        }
    }
    
    public void sellItemPaid(Item item){
        Date d1 = new Date();
        
        Invoice sell_paid1 = new Sell_Paid(77, item, d1.toString(), 1, item.getPrice());
        sell_paid1.printData();
        item.printData();
    }
    
    public void sellItemUnpaid(Item item){
        Date d1 = new Date();
        
        Invoice sell_unpaid1 = new Sell_Unpaid(78, item, d1.toString(), 1, item.getPrice(), d1.toString());
        sell_unpaid1.printData();
        item.printData();
    }
    
    public void sellItemInstallment(Item item){
        Date d1 = new Date();
        
        Invoice sell_installment1 = new Sell_Installment(35, item, d1.toString(), 1, item.getPrice(), 22);
        sell_installment1.printData();
        item.printData();
    }
}