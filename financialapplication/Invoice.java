import java.util.HashMap;
import java.util.Map;
class Invoice {
    private String poNumber;
    private double amount;

    public Invoice(String poNumber, double amount) throws InvalidInvoiceAmountException {
        if (amount <= 0) {
            throw new InvalidInvoiceAmountException("Invoice amount must be positive.");
        }
        this.poNumber = poNumber;
        this.amount = amount;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice [PO Number: " + poNumber + ", Amount: $" + amount + "]";
    }
}