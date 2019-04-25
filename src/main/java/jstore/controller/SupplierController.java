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

    @RequestMapping(value = "/supplier/{id_supplier}", method=  RequestMethod.GET)
    public Supplier getSupplier(@PathVariable int id_supplier) {
        Supplier supplier = DatabaseSupplier.getSupplier(id_supplier);
        return supplier;
    }

}