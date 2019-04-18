public class CustomerNotFoundException extends Exception{
    private int customer_error;

    public CustomerNotFoundException(int customer_input){
        super();
        this.customer_error = customer_input;
    }

    public String getExMessage(){
        return super.getMessage() + "Customer ID: " +
                customer_error + " not found.";
    }
}




