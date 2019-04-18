public class SupplierNotFoundException extends Exception{
    private int supplier_error;

    public SupplierNotFoundException(int supplier_input)
    {
        super();
        this.supplier_error = supplier_input;
    }

    public String getExMessage()
    {
        return super.getMessage() + "Supplier ID: " +
                supplier_error + " not found.";
    }
}