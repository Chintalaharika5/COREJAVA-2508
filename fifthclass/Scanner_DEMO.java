// import -> keyword is used to call packages which are in system or on internet
/**
 * The {@code fifthclass} package contains classes and examples 
 * demonstrating core Java concepts, such as input handling using Scanner.
 */
package fifthclass;

import java.util.Scanner;

public class Scanner_Demo {
    public static void main(String[] args) {
        // Prompt a user for his ID & NAME
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Enter Your ID: ");
        int id = input.nextInt();
        System.out.println("Hi "+name+ " your ID is: "+id);
        System.out.println("Work Completed Stop Taking Input");
        input.close(); // close the input
    }
}