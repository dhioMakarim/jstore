package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.*;

@RestController
public class SupplierController {

    @RequestMapping(value = "/supplier", method= RequestMethod.GET)
    public ArrayList<Supplier> supplierList() {
        ArrayList<Supplier> list;
        try {
            list = DatabaseSupplier.getSupplierDatabase();
        }
        catch (Exception ex){
            ex.getMessage();
            return null;
        }
        return list;
    }

    @RequestMapping(value = "/suppliers/{id_supplier}", method= RequestMethod.GET)
    public Supplier getItemFromID(@PathVariable int id_supplier)
    {
        Supplier supplier;
        try {
            supplier = DatabaseSupplier.getSupplier(id_supplier);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }
        return supplier;
    }

}