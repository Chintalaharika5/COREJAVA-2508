package Application_Form;

public class Data_Form {
    public static void main(String[] args) {
        String uniName = "Pangasinan State University";
        byte year = 1;
        boolean isTransferee = false;
        boolean isReturnee = false;

        String lastName = "HARIKA";
        String firstName = "CH";
        String middleName = "";
        String address = "West Midnipur, Kharagpur";
        short yearOfBirth = 2003;
        byte age = 21;
        String birthPlace = "Kharagpur";
        char citizenship = 'F'; 
        char sex = 'F';  // Corrected to F for Female
        char civilStatus = 'S'; 
        long contactNumber = 9846218257L;
        String email = "chinharika5@gmail.com";

        String srHighSchool = "Little Scholar School";
        float gpa = 7.5f;
        short graduationYear = 2019;

        String fatherName = "Ramesh CH";
        String motherName = "Sunita CH";
        String occupation = "Businessman";
        int monthlySalary = 300000;

        boolean isALS = true;
        boolean isPhysicallyDisabled = false;
        String disabilityType = "None";
        String signature = "Harika CH";

        // Printing the Admission Form
        System.out.println("APPLICATION FOR COLLEGE ADMISSION TEST");
        System.out.println("University: " + uniName);
        System.out.println("Year Level: " + year);
        System.out.println("Transferee: " + isTransferee);
        System.out.println("Returnee: " + isReturnee);
        System.out.println("Name: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Birth Year: " + yearOfBirth);
        System.out.println("Age: " + age);
        System.out.println("Birthplace: " + birthPlace);
        System.out.println("Citizenship: " + (citizenship == 'F' ? "Filipino" : "Others"));
        System.out.println("Sex: " + (sex == 'M' ? "Male" : "Female"));
        System.out.println("Civil Status: " + (civilStatus == 'S' ? "Single" : "Married"));
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Senior High School: " + srHighSchool);
        System.out.println("GPA: " + gpa);
        System.out.println("Graduation Year: " + graduationYear);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Mother's Name: " + motherName);
        System.out.println("Occupation: " + occupation);
        System.out.println("Monthly Salary: ₱" + monthlySalary);
        System.out.println("ALS Passer: " + isALS);
        System.out.println("Physically Disabled: " + isPhysicallyDisabled);
        System.out.println("Disability Type: " + disabilityType);
        System.out.println("Signature: " + signature);
    }    
}
