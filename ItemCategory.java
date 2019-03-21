
/**
 * Enumeration class ItemCategory - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum ItemCategory
{
    Electronics("Electronics"), 
    Furniture("Furniture"), 
    Installment("Installment");

    private String category;

    ItemCategory(String category)
    {
        this.category = category;
    }

    public String toString()
    {
        return category;
    }
}

