import java.util.HashMap;
import java.util.Map;

class Pharmacy {
    private Map<String, Medicine> inventory = new HashMap<>();

    public Pharmacy() {
        inventory.put("Aspirin", new Medicine("Aspirin", 50));
        inventory.put("Paracetamol", new Medicine("Paracetamol", 100));
        inventory.put("Ibuprofen", new Medicine("Ibuprofen", 30));
    }

    public void processPrescription(Prescription prescription) throws OutOfStockException, IncompletePrescriptionException {
        if (!prescription.isComplete()) {
            throw new IncompletePrescriptionException("Prescription is missing essential details.");
        }

        Medicine medicine = inventory.get(prescription.getMedicineName());

        if (medicine == null) {
            throw new IncompletePrescriptionException("Medicine " + prescription.getMedicineName() + " is not available.");
        }

        if (prescription.getQuantity() > medicine.getStock()) {
            throw new OutOfStockException("Not enough stock available for " + medicine.getName() + ". Available: " + medicine.getStock());
        }

        medicine.reduceStock(prescription.getQuantity());
        System.out.println("Prescription processed successfully for " + prescription.getPatientName() +
                ". Medicine: " + prescription.getMedicineName() + ", Quantity: " + prescription.getQuantity());
    }
}
