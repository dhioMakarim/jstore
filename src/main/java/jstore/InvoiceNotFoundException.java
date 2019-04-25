package jstore;

public class InvoiceNotFoundException extends Exception {
    private int invoice_error;

    public InvoiceNotFoundException(int invoice_input) {
        super();
        this.invoice_error=invoice_input;
    }

    public String getExMessage() {
        return super.getMessage() +"Invoice ID: "+ invoice_error + " not found.";
    }
}