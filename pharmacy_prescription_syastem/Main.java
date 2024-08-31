public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        Prescription prescription1 = new Prescription("John Doe", "Aspirin", 100, 10);
        Prescription prescription2 = new Prescription("Jane Doe", "Paracetamol", 500, 150); 
        Prescription prescription3 = new Prescription("", "Ibuprofen", 200, 5); 
        try {
            pharmacy.processPrescription(prescription1);
        } catch (OutOfStockException | IncompletePrescriptionException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            pharmacy.processPrescription(prescription2);
        } catch (OutOfStockException | IncompletePrescriptionException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            pharmacy.processPrescription(prescription3);
        } catch (OutOfStockException | IncompletePrescriptionException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
