package jstore;
/**
 * Kelas supplier ini berfungsi untuk mendaftarkan supplier jstore dengan
 * pembeda berupa id dan nama serta beberapa informasi lebih detail berupa 
 * email, nomor telepon serta lokasi.
 * Selain itu supplier yang telah didaftarkan dapat dikembalikan nilai tiap
 * parameternya menggunakan method get serta dapat juga diubah nilainya
 * menggunakan method set.
 *
 * @author Dhio Makarim Utomo
 * @version 28-Feb-2019
 */
public class Supplier
{
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
     * Method untuk mengembalikan id supplier
     *
     * @return    id supplier
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Method untuk mengembalikan nama supplier
     *
     * @return    nama supplier
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Method untuk mengembalikan email supplier
     *
     * @return    email supplier
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Method untuk mengembalikan nomor telepon supplier
     *
     * @return    nomor telepon supplier
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * Method untuk mengembalikan lokasi supplier
     *
     * @return    objek lokasi supplier
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * Method untuk mengubah id supplier
     *
     * @param  id  id dari suatu supplier
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Method untuk mengubah nama supplier
     *
     * @param  name  nama dari suatu supplier
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Method untuk mengubah email supplier
     *
     * @param  email  email dari suatu supplier
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * Method untuk mengubah nomor telepon supplier
     *
     * @param  phoneNumber  nomor telepon dari suatu supplier
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Method untuk mengubah lokasi supplier
     *
     * @param  location  objek lokasi dari suatu supplier
     */
    public void setLocation(Location location)
    {
        this.location = location;
    }
    
    /**
     * Method untuk menampilkan nama supplier
     *
     */
    public String toString()
    {
        System.out.println("==========SUPPLIER==========");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("PhoneNumber: " + phoneNumber);
        System.out.println("Location: " + location.getCity());
        return "";
    }
}
