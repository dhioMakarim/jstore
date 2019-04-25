package jstore;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


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
        SpringApplication.run(JStore.class, args);

        Location lokasi1 = new Location("Depok", "Jawa Barat", "Jawa bagian barat");


        try
        {
            DatabaseSupplier.addSupplier(new Supplier("nama1",
                    "nama1@mail.com", "080800001111",
                    lokasi1));
        }
        catch (Exception ex)
        {
            ex.getMessage();
        }
        try
        {
            DatabaseSupplier.addSupplier(new Supplier("nama2",
                    "nama2@mail.com", "080800002222",
                    lokasi1));
        }
        catch (Exception ex)
        {
            ex.getMessage();
        }
        try
        {
            DatabaseSupplier.addSupplier(new Supplier("nama3",
                    "nama3@mail.com", "080800003333",
                    lokasi1));
        }
        catch (Exception ex)
        {
            ex.getMessage();
        }

        try
        {
            DatabaseItem.addItem(new Item("item1",  ItemStatus.New,
                    5000, ItemCategory.Electronics,
                    DatabaseSupplier.getSupplier(1)));
        }
        catch (Exception ex)
        {
            ex.getMessage();
        }
        try
        {
            DatabaseItem.addItem(new Item("item2",  ItemStatus.New,
                    5000, ItemCategory.Electronics,
                    DatabaseSupplier.getSupplier(2)));
        }
        catch (Exception ex)
        {
            ex.getMessage();
        }
        try
        {
            DatabaseItem.addItem(new Item("item3",  ItemStatus.New,
                    5000, ItemCategory.Electronics,
                    DatabaseSupplier.getSupplier(3)));
        }
        catch (Exception ex)
        {
            ex.getMessage();
        }
        try
        {
            DatabaseItem.addItem(new Item("item4",  ItemStatus.New,
                    5000, ItemCategory.Electronics,
                    DatabaseSupplier.getSupplier(1)));
        }
        catch (Exception ex)
        {
            ex.getMessage();
        }
    }
}