package jstore;
/**
 * Write a description of class JStore here.
 *
 * @author Dhio Makarim Utomo
 * @version 28-Feb-2019
 */

import java.util.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

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

        Location location1 = new Location("Depok",
                "Jawa Barat", "Rumah");

        try
        {
            DatabaseSupplier.addSupplier(new Supplier("org",
                    "org@mail.com", "081294447597",
                    location1));
        }
        catch (Exception ex)
        {
            ex.getMessage();
        }

        try
        {
            DatabaseItem.addItem(new Item("lepi", 5000,
                    ItemCategory.Electronics, ItemStatus.New,
                    DatabaseSupplier.getSupplier(1)));
        }
        catch (Exception ex)
        {
            ex.getMessage();
        }
        try
        {
            DatabaseItem.addItem(new Item("hape", 3000,
                    ItemCategory.Electronics, ItemStatus.New,
                    DatabaseSupplier.getSupplier(1)));
        }
        catch (Exception ex)
        {
            ex.getMessage();
        }
        try
        {
            DatabaseItem.addItem(new Item("pees", 4000,
                    ItemCategory.Electronics, ItemStatus.New,
                    DatabaseSupplier.getSupplier(1)));
        }
        catch (Exception ex)
        {
            ex.getMessage();
        }
    }
}
