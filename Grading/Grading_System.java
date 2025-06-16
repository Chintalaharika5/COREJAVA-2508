package Grading;

public class Grading_System {
public static void main(String[] args) {
        short studentId = 105;
        String studentName = "Harika Chintala";
        byte yearOfStudy = 4;
        byte semester = 2;
        double javaProgramming = 85;
        double dataStructures = 76;
        double computerNetworks = 88;
        double totalMarks = javaProgramming + dataStructures + computerNetworks;
        double averageMarks = totalMarks / 3;
        boolean isPassed = averageMarks >= 50;
        boolean qualification = javaProgramming > 60 && dataStructures > 70 && computerNetworks > 70
                && averageMarks >= 80;

        System.out.println("=== Student Grading System ===");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Year of Study: " + yearOfStudy);
        System.out.println("Semester: " + semester);
        System.out.println("Java Programming Marks: " + javaProgramming);
        System.out.println("Data Structures Marks: " + dataStructures);
        System.out.println("Computer Networks Marks: " + computerNetworks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Is Passed: " + isPassed);
        System.out.println("Qualified for Distinction: " + qualification);
    }
}

    
