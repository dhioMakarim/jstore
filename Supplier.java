
/**
 * Data supplier dari toko.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */
public class Supplier
{
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    /**
     * Constructor untuk objects dari class Supplier
     */
    public Supplier(int id,
        String name,
        String email,
        String phoneNumber,
        Location location)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
    }
    /**
     * Metode untuk mendapatkan id supplier
     */
    public int getId()
    {
        return id;
    }
    /**
     * Metode untuk mendapatkan nama supplier
     */
    public String getName()
    {
        return name;
    }
    /**
     * Metode untuk mendapatkan email supplier
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * Metode untuk mendapatkan nomor telpon supplier
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    /**
     * Metode untuk mendapatkan lokasi supplier
     * Menyambung ke class Location
     */
    public Location getLocation()
    {
        return location;
    }
    /**
     * Metode untuk mengisi id supplier
     */
    public void setId(int id)
    {
        this.id=id;
    }
    /**
     * Metode untuk mengisi nama supplier
     */
    public void setName(String name)
    {
        this.name=name;
    }
    /**
     * Metode untuk mengisi email supplier
     */
    public void setEmail(String email)
    {
        this.email=email;
    }
    /**
     * Metode untuk mengisi nomor telpon supplier
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    /**
     * Metode untuk mengisi lokasi supplier
     * Menyambung ke class Location
     */
    public void setLocation(Location location)
    {
        this.location=location;
    }
    /**
     * Metode untuk mencetak nama supplier
     * 
     */
    public void printData()
    {
        System.out.println("============SUPPLIER============");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("No. Telp: " + phoneNumber);
        System.out.println("Lokasi: " + location.getCity());
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return  y;
    }
}
