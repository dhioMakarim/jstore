import java.util.*;
/**
 * Write a description of class JStore here.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */
public class JStore
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
        // initialise instance variables
    }

    /**
     * Fungsi utama yang akan dijalankan
     */
    public static void main(String[] args)
    {
        Location lokasi = new Location("Depok", "Jawa Barat", "Di Barat Jawa");

        try
        {
            DatabaseSupplier.addSupplier(new Supplier("supplier1", "email1@gmail.com",
                    "081208120812", lokasi));
        }
        catch (SupplierAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseSupplier.addSupplier(new Supplier("supplier2", "email2@gmail.com",
                    "081208120811", lokasi));
        }
        catch (SupplierAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseSupplier.addSupplier(new Supplier("supplier3", "email3@gmail.com",
                    "081208120810", lokasi));
        }
        catch (SupplierAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }

        for(Supplier data : DatabaseSupplier.getSupplierDatabase())
        {
            data.toString();
        }

        try
        {
            DatabaseCustomer.addCustomer(new Customer("customer1", "email1@gmail.com",
                    "user1", "pass1", 1998, 8, 18));
        }
        catch (CustomerAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseCustomer.addCustomer(new Customer("customer2", "email2@gmail.com",
                    "user2", "pass1", 1998, 8, 18));
        }
        catch (CustomerAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseCustomer.addCustomer(new Customer("customer3", "email3@gmail.com",
                    "user3", "pass3", 1998, 8, 18));
        }
        catch (CustomerAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }

        for(Customer data : DatabaseCustomer.getCustomerDatabase())
        {
            data.toString();
        }

        try
        {
            DatabaseItem.addItem(new Item("item1", ItemStatus.New , 5000,
                    ItemCategory.Electronics, DatabaseSupplier.getSupplier(1)));
        }
        catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseItem.addItem(new Item("item2", ItemStatus.New , 5000,
                    ItemCategory.Electronics, DatabaseSupplier.getSupplier(2)));
        }
        catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseItem.addItem(new Item("item3", ItemStatus.New , 5000,
                    ItemCategory.Electronics, DatabaseSupplier.getSupplier(3)));
        }
        catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }

        for(Item data : DatabaseItem.getItemDatabase())
        {
            data.toString();
        }

        ArrayList<Integer> item = new ArrayList<Integer>();
        item.add(DatabaseItem.getItemFromID(1).getId());
        item.add(DatabaseItem.getItemFromID(2).getId());
        try
        {
            DatabaseInvoice.addInvoice(new Sell_Installment(item,
                    5, DatabaseCustomer.getCustomer(1)));
        }
        catch (InvoiceAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }

        ArrayList<Integer> item2 = new ArrayList<Integer>();
        item2.add(DatabaseItem.getItemFromID(1).getId());
        item2.add(DatabaseItem.getItemFromID(3).getId());
        try
        {
            DatabaseInvoice.addInvoice(new Sell_Unpaid(item2,
                    DatabaseCustomer.getCustomer(2)));
        }
        catch (InvoiceAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
    }
}