package LMS_PROJECT;

public class Course {
    // Variables
    int courseId;
    String courseName;
    String description;
    byte durationMonths;
    boolean isOnline;
    float rating;
    String instructor;
    String level;
    int price;
    float discount;
    short studentsEnrolled;

    // Constructor
    public Course(int courseId, String courseName, String description, byte durationMonths,
                  boolean isOnline, float rating, String instructor, String level,
                  int price, float discount, short studentsEnrolled) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
        this.durationMonths = durationMonths;
        this.isOnline = isOnline;
        this.rating = rating;
        this.instructor = instructor;
        this.level = level;
        this.price = price;
        this.discount = discount;
        this.studentsEnrolled = studentsEnrolled;
    }

    // Print Method
    public void printDetails() {
        System.out.println("===== Course Details =====");
        System.out.println("ID: " + courseId);
        System.out.println("Name: " + courseName);
        System.out.println("Description: " + description);
        System.out.println("Duration: " + durationMonths + " months");
        System.out.println("Is Online: " + isOnline);
        System.out.println("Rating: " + rating);
        System.out.println("Instructor: " + instructor);
        System.out.println("Level: " + level);
        System.out.println("Price: ₹" + price);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Students Enrolled: " + studentsEnrolled);
    }   
}
