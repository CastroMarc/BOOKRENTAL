import java.util.*;
import java.io.*;

class BookInfo{
String[] Title = {"System Analysis and Design", "Android Application", "Programming Concepts and Logic Fomulation"};
String[] Author = {"Gary B. Shelly", "Corinne Hoisington", "Rosauro E. Manuel"};
int[] Copies = {2,3,4};
Scanner scanner= new Scanner(System.in);

public void firstChoice() {
    System.out.println("You Rented System Analyst and Design by Gary B. Shelly ");
    System.out.println("Rent again? Y/N");
    String C = scanner.nextLine();
    if(!C.equals("Y"))
    {
        return;
    }
    else{
        System.out.println("PROGRAM ENDS");
    }
 }

public void secondChoice() {
    System.out.println("You Rented Android Application by Corrine Hoisington ");
    System.out.println("Rent again? Y/N");
    String C = scanner.nextLine();
    if(!C.equals("Y"))
    {
        return;
    }
    else{
        System.out.println("PROGRAM ENDS");
    }
}
public void thirdChoice() {
    System.out.println("You Rented Programming Concepts and Logic Formulation by Rosauro E. Manuel ");
    System.out.println("Rent again? Y/N");
    String C = scanner.nextLine();
    if(!C.equals("Y"))
    {
        return;
    }
    else{
        System.out.println("PROGRAM ENDS");
    }
}
}
