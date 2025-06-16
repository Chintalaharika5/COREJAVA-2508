package LMS_PROJECT;

public class Trainer {
    // Variables
    int trainerId;
    String trainerName;
    byte trainerAge;
    char gender;
    byte experience;
    long contact;
    String email;
    String address;
    String specialization;
    String qualification;
    int salary;
    float rating;
    boolean isExpert;

    // Constructor
    public Trainer(int trainerId, String trainerName, byte trainerAge, char gender,
                   byte experience, long contact, String email, String address,
                   String specialization, String qualification, int salary,
                   float rating, boolean isExpert) {
        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.trainerAge = trainerAge;
        this.gender = gender;
        this.experience = experience;
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.specialization = specialization;
        this.qualification = qualification;
        this.salary = salary;
        this.rating = rating;
        this.isExpert = isExpert;
    }

    // Print Method
    public void printDetails() {
        System.out.println("===== Trainer Details =====");
        System.out.println("ID: " + trainerId);
        System.out.println("Name: " + trainerName);
        System.out.println("Age: " + trainerAge);
        System.out.println("Gender: " + gender);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Contact: " + contact);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + specialization);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Rating: " + rating);
        System.out.println("Expert: " + isExpert);
    }
}
