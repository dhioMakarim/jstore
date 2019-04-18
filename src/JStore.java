import java.util.*;
/**
 * Write a description of class JStore here.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */
public class JStore
{
    
    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
     
    }
    public static void main(String[] args)
    {
       Location lokasi = new Location("Jawa Barat", "Jawa Bagian Barat", "Depok");
       Supplier supplier1 = new Supplier("supplier 1", "supplier1@gmail.com", "080812127571", lokasi);
       DatabaseSupplier.addSupplier(supplier1);
       Supplier supplier2 = new Supplier("supplier 2", "supplier2@gmail.com", "080812127572", lokasi);
       DatabaseSupplier.addSupplier(supplier2);
       Supplier supplier3 = new Supplier("supplier 3", "supplier3@gmail.com", "080812127573", lokasi);
       
       
       DatabaseSupplier.addSupplier(supplier3);
       
       
       
       for (Supplier supplier : DatabaseSupplier.getSupplierDatabase())
       
       {
           System.out.println(supplier);
           
       }
       
       
       Customer customer1 = new Customer("nama 1", "email1@gmail.com", "user1", "Asdf1234", 1998, 6, 10);
       DatabaseCustomer.addCustomer(customer1);
       Customer customer2 = new Customer("nama 2", "email2@gmail.com", "user2", "Asdf1234", 1998, 6, 10);
       DatabaseCustomer.addCustomer(customer2);
       Customer customer3 = new Customer("nama 3", "email3@gmail.com", "user3", "Asdf1234", 1998, 6, 10);
       
       
       DatabaseCustomer.addCustomer(customer3);
       
       for (Customer customer : DatabaseCustomer.getCustomerDatabase())
       
       {
           System.out.println(customer);
           
       }
       
       DatabaseItem.addItem(new Item("item1", 10, ItemStatus.New, 10000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(1)));
       DatabaseItem.addItem(new Item("item2", 12, ItemStatus.New, 11000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(2)));
       DatabaseItem.addItem(new Item("item3", 14, ItemStatus.New, 12000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(3)));
       DatabaseItem.addItem(new Item("item4", 16, ItemStatus.New, 13000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(1)));
       
       for (Item item : DatabaseItem.getItemDatabase())
       
       {
           System.out.println(item);
           
       }
       
       
       ArrayList<Integer> items = new ArrayList<>();
       items.add(1);
       items.add(2);
       ArrayList<Integer> items1 = new ArrayList<>();
       items.add(2);
       ArrayList<Integer> items2 = new ArrayList<>();
       items.add(2);
       items.add(3);
       
       DatabaseInvoice.addInvoice(new Sell_Paid(items, DatabaseCustomer.getCustomer(1)));
       DatabaseInvoice.addInvoice(new Sell_Unpaid(items1, DatabaseCustomer.getCustomer(2)));
       DatabaseInvoice.addInvoice(new Sell_Installment(items2, 12, DatabaseCustomer.getCustomer(3)));
       
       for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
       
       {
           System.out.println(invoice);
           
       }
       /*Supplier supplier1 = new Supplier(17, "sebuah supplier", "sebuah.email@gmail.com", "080812127575", lokasi);
     
       Item item1 = new Item(02, "sebuah item", 9, ItemStatus.New, 20000, ItemCategory.Electronics, supplier1);
       databaseItem.addItem(item1);
       
       Transaction transaction = new Transaction(databaseItem);
       transaction.orderNewItem(item1);
       transaction.sellItemPaid(item1);
       transaction.sellItemUnpaid(item1);
       transaction.sellItemInstallment(item1);*/
    }
}