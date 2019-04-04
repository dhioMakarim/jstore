
/**
 * Lokasi yang dari supplier.
 *
 * @author Dhio Makarim Utomo
 * @version 0.1.2 28/02/2019
 */
public class Location
{
    // instance variables
    private String province;
    private String description;
    private String city;

    /**
     * Constructor for objects of class Location
     */
    public Location(String city, String province, String description)
    {
        // initialise instance variables
        this.city = city;
        this.province = province;
        this.description = description;
    }

    /**
     * get location province
     * @return    location's province
     */
    public String getProvince()
    {
        return province;
    }
    
    /**
     * get location city
     * @return    location's city
     */
    public String getCity()
    {
        return city;
    }
    
    /**
     * get location description
     * @return    location's description
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * set location province
     * @param   province   location's province
     */
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    /**
     * set location city
     * @param   city   location's city
     */
    public void setCity(String city)
    {
        this.city = city;
    }
    
    /**
     * set location description
     * @param   description   location's description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    /**
     * printing province data
     */
    public void printData(){
        System.out.print("LOCATION");
        System.out.println("");
        System.out.print("Provinsi : ");
        System.out.println(this.province);
        System.out.print("Kota : ");
        System.out.println(this.city);
        System.out.print("Deskripsi");
        System.out.println("");
        System.out.print("Lokasi");
        System.out.println("");
    }
}