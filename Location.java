
/**
 * Write a description of class Location here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location
{
    private String province;
    private String description;
    private String city;

    /**
     * Constructor for objects of class Location
     */
    public Location(String province,
        String description,
        String city)
    {
        this.province=province;
        this.description=description;
        this.city=city;
    }
    public String getProvince()
    {
        return province;
    }
    public String getDescription()
    {
        return description;
    }
    public String getCity()
    {
        return city;
    }
    public void setProvince(String province)
    {
        this.province=province;
    }
    public void setDescription(String Description)
    {
        this.description=description;
    }
    public void setCity(String City)
    {
        this.city=city;
    }
    public void printData()
    {
        System.out.println("provinsi: " + province);
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
