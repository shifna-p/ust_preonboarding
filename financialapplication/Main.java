import java.util.HashMap;
import java.util.Map;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static Map<String, PurchaseOrder> purchaseOrderDB = new HashMap<>();

    public static void main(String[] args) {
        purchaseOrderDB.put("PO123", new PurchaseOrder("PO123"));
        purchaseOrderDB.put("PO124", new PurchaseOrder("PO124"));

        try {
            processInvoice("PO123", 1500.0);
            processInvoice("PO125", 2000.0); 
            processInvoice("PO123", -500.0); 
        } catch (Exception e) {
            logError(e.getMessage());
        }
    }

    public static void processInvoice(String poNumber, double amount) throws InvalidInvoiceAmountException, PurchaseOrderNotFoundException {
        if (!purchaseOrderDB.containsKey(poNumber)) {
            throw new PurchaseOrderNotFoundException("Purchase order not found: " + poNumber);
        }

        Invoice invoice = new Invoice(poNumber, amount);
        System.out.println("Invoice processed successfully: " + invoice);
    }

    public static void logError(String message) {
        System.err.println("Error: " + message);

        try (FileWriter fw = new FileWriter("error_log.txt", true)) {
            fw.write(message + "\n");
        } catch (IOException e) {
            System.err.println("Failed to log error: " + e.getMessage());
        }
    }
}
