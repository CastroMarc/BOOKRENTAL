import java.util.*;
import java.io.*;

public class BookRental extends BookInfo{
    static Scanner scanner = new Scanner(System.in); 
    
    while (true) {
        System.out.println("ELECTTRIC BOOK RENTAL SYSTEM");
        System.out.println("*****************************");
        System.out.println("[0] System Analyst and Design by Gary B Shelly");
        System.out.println("[1] Android Application by Corrine Hoisington");
        System.out.println("[2] Programming Concepts and Logic Formulation by Rosauro E. Manuel");
        System.out.println("*****************************");
        System.out.print("\nCHOOSE A NUMBER TO RENT YOUR FAVORITE BOOK: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
            firstChoice();
                break;
            case 1:
            secondChoice();
                break;
            case 2:
            thirdChoice();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
