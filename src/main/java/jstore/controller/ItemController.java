package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.*;

@RestController
public class ItemController {

    @RequestMapping(value = "/items", method= RequestMethod.GET)
    public ArrayList<Item> itemsList() {
        ArrayList<Item> list;
        try {
            list = DatabaseItem.getItemDatabase();
        }
        catch (Exception ex){
            ex.getMessage();
            return null;
        }
        return list;
    }

    @RequestMapping(value = "/items/{id_item}", method= RequestMethod.GET)
    public Item getItemFromID(@PathVariable int id_item) {
        Item item = DatabaseItem.getItemFromID(id_item);
        return item;
    }

}