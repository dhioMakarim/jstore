public class SupplierAlreadyExistsException extends Exception{
    private Supplier supplier_error;

    public SupplierAlreadyExistsException(Supplier supplier_input)
    {
        super();
        this.supplier_error = supplier_input;
    }

    public String getExMessage()
    {
        return super.getMessage() + "Supplier Email: " + supplier_error.getEmail() +
                " ,or phoneNumber: " +
                supplier_error.getPhoneNumber()+
                " already exists.";
    }
}