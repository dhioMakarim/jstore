package jstore;
/**
 * Data supplier dari toko.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */
public class Supplier
{
    // instance variables
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    
    /**
     * Constructor for objects of class Supplier
     */
    public Supplier(String name, String email, String phoneNumber, Location location)
    {
        this.id = DatabaseSupplier.getLastSupplierID() + 1;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    /**
     * return supplier id
     * @return      supplier's id
     */
    public int getId() 
    {
        return id;
    }

    /**
     * set supplier id
     * @param   id   supplier's id
     */
    public void setId(int id) 
    {
        this.id = id;
    }

    /**
     * get supplier name
     * @return      supplier's name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * set supplier name
     * @param   name   supplier's name
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * get supplier email
     * @return      supplier's email
     */
    public String getEmail() 
    {
        return email;
    }

    /**
     * set supplier email
     * @param   email   supplier's email
     */
    public void setEmail(String email) 
    {
        this.email = email;
    }

    /**
     * get supplier phone number
     * @return      supplier's phone number
     */
    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    /**
     * set supplier phone number
     * @param   phoneNumber   supplier's phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    /**
     * get supplier object
     * @return      supplier's location object
     */
    public Location getLocation() 
    {
        return location;
    }

    /**
     * set supplier location
     * @param   location   supplier's location
     */
    public void setLocation(Location location) {
        this.location = location;
    }
    
    /**
     * print supplier's name
     */
    /* public void printData(){
        System.out.print("SUPPLIER dan ID");
        System.out.println("");
        System.out.print("Nama : ");
        System.out.println(this.name);
        System.out.print("Email : ");
        System.out.println(this.email);
        System.out.print("No telfon");
        System.out.println(this.phoneNumber);
        System.out.print("Lokasi");
        System.out.println("");
    } */
    public String toString()
    {
        return "==========SUPPLIER==========" +
        "\nID: " + id +
        "\nName: " + name +
        "\nEmail: " + email +
        "\nPhoneNumber: " + phoneNumber +
        "\nLocation: " + location.getCity();
        
    }
}