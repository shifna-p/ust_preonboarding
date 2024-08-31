class Prescription {
    private String patientName;
    private String medicineName;
    private int dosage;
    private int quantity;

    public Prescription(String patientName, String medicineName, int dosage, int quantity) {
        this.patientName = patientName;
        this.medicineName = medicineName;
        this.dosage = dosage;
        this.quantity = quantity;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public int getDosage() {
        return dosage;
    }
    public int getQuantity() {
        return quantity;
    }

    public boolean isComplete() {
        return patientName != null && !patientName.isEmpty() &&
               medicineName != null && !medicineName.isEmpty() &&
               dosage > 0 && quantity > 0;
    }
}