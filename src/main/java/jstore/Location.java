package jstore;
/**
 * Kelas ini berfungsi untuk mendaftarkan lokasi sebagai
 * data dari supplier
 *
 * @author Dhio Makarim Utomo
 * @version 28-Feb-2019
 */
public class Location
{
    private String province;
    private String description;
    private String city;

    /**
     * Constructor for objects of class Location
     */
    public Location(String city, String province, String description)
    {
        this.city = city;
        this.province = province;
        this.description = description;
    }

    /**
     * Method untuk mengembalikan nama provinsi
     *
     * @return    nama provinsi
     */
    public String getProvince()
    {
        return province;
    }
    
    /**
     * Method untuk mengembalikan nama kota
     *
     * @return    nama kota
     */
    public String getCity()
    {
        return city;
    }
    
    /**
     * Method untuk mengembalikan deskripsi kota
     *
     * @return    deskripsi kota
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Method untuk mengubah nama provinsi
     *
     * @param  province  nama provinsi
     */
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    /**
     * Method untuk mengubah nama kota
     *
     * @param  city  nama kota
     */
    public void setCity(String city)
    {
        this.city = city;
    }
    
    /**
     * Method untuk mengubah deskripsi kota
     *
     * @param  description  deskripsi kota
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    /**
     * Method untuk menampilkan nama provinsi
     *
     */
    public String toString()
    {
        System.out.println("==========LOCATION==========");
        System.out.println("Province: " + province);
        System.out.println("City: " + city);
        System.out.println("Description: " + description);
        return "";
    }
}
