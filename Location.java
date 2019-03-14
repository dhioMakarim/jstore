
/**
 * Lokasi yang dari supplier.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */
public class Location
{
    private String province;
    private String description;
    private String city;

    /**
     * Constructor untuk objects dari class Location
     */
    public Location(String province,
        String description,
        String city)
    {
        this.province=province;
        this.description=description;
        this.city=city;
    }
    /**
     * Metode untuk mendapatkan provinsi lokasi supplier
     */
    public String getProvince()
    {
        return province;
    }
    /**
     * Metode untuk mendapatkan deskripsi lokasi supplier
     */
    public String getDescription()
    {
        return description;
    }
    /**
     * Metode untuk mendapatkan kota lokasi supplier
     */
    public String getCity()
    {
        return city;
    }
    /**
     * Metode untuk mengisi provinsi lokasi supplier
     */
    public void setProvince(String province)
    {
        this.province=province;
    }
    /**
     * Metode untuk mengisi deskripsi lokasi supplier
     */
    public void setDescription(String Description)
    {
        this.description=description;
    }
    /**
     * Metode untuk mengisi kota lokasi supplier
     */
    public void setCity(String City)
    {
        this.city=city;
    }
    /**
     * Metode untuk mencetak nama provinsi supplier
     * 
     */
    public void printData()
    {
        System.out.println("============LOCATION============");
        System.out.println("Provinsi: " + province);
        System.out.println("Kota: " + city);
        System.out.println("Deskripsi: " + description);
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
        return y;
    }
}
