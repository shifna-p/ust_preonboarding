import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient patient = null;

        while (patient == null) {
            try {
                System.out.print("Enter patient's name: ");
                String name = scanner.nextLine();

                System.out.print("Enter patient's age: ");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter patient's medical history: ");
                String medicalHistory = scanner.nextLine();

                patient = new Patient(name, age, medicalHistory);
                System.out.println("Patient record created successfully!");
                System.out.println(patient);

            } catch (InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please re-enter the patient data.\n");
            } catch (MedicalHistoryNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please re-enter the patient data.\n");
            } catch (NumberFormatException e) {
                System.out.println("Error: Age must be a valid integer.");
                System.out.println("Please re-enter the patient data.\n");
            }
        }

        scanner.close();
    }
}
