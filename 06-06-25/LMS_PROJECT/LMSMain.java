package LMS_PROJECT;

public class LMSMain {
    public static void main(String[] args) {
        // Create Student Object
        Student student = new Student((short)1021, "John Doe", (byte)20, 'M',
                "Java Full Stack", "john.doe@lms.com", 9876543210L, "Hyderabad",
                4.2f, false);

        // Create Trainer Object
        Trainer trainer = new Trainer(765, "Ravi", (byte)35, 'M', (byte)12,
                9876543210L, "ravi@gmail.com", "Bangalore", "Java", "M.Tech",
                50000, 4.5f, true);

        // Create Course Object
        Course course = new Course(13, "Data Science",
                "This course includes Python, AI, ML, Data Analysis, etc.",
                (byte)6, false, 4.5f, "Dr. John", "Intermediate",
                20000, 0.1f, (short)200);

        // Print All Details
        student.printDetails();
        System.out.println(); // spacer
        trainer.printDetails();
        System.out.println(); // spacer
        course.printDetails();
    }  
}
