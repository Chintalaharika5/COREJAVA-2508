package LMS_PROJECT;

public class Student {
    // Variables
    short studentId;
    String studentName;
    byte age;
    char gender;
    String courseName;
    String email;
    long phone;
    String address;
    float studentRating;
    boolean isInstructor;

    // Constructor
    public Student(short studentId, String studentName, byte age, char gender,
                   String courseName, String email, long phone, String address,
                   float studentRating, boolean isInstructor) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.courseName = courseName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.studentRating = studentRating;
        this.isInstructor = isInstructor;
    }

    // Print Method
    public void printDetails() {
        System.out.println("===== Student Details =====");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Course: " + courseName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Rating: " + studentRating);
        System.out.println("Is Instructor: " + isInstructor);
    }
}

    

