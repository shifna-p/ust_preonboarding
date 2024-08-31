class Patient {
    private String name;
    private int age;
    private String medicalHistory;

    public Patient(String name, int age, String medicalHistory) throws InvalidAgeException, MedicalHistoryNotFoundException {
        if (age <= 0) {
            throw new InvalidAgeException("Age must be a positive integer.");
        }
        if (medicalHistory == null || medicalHistory.isEmpty()) {
            throw new MedicalHistoryNotFoundException("Medical history must be provided.");
        }
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    @Override
    public String toString() {
        return "Patient Name: " + name + ", Age: " + age + ", Medical History: " + medicalHistory;
    }
}
