//Think Java: 3.12	2	Celsius.java
// Exercise 2   Write a program that converts a temperature from Celsius to Fahrenheit. It should (1) prompt the user for input, (2) read a double value from the keyboard, (3) calculate the result, and (4) format the output to one decimal place. For example, it should display "24.0 C = 75.2 F".
// Here is the formula. Be careful not to use integer division!
// F = C × 9/5 + 32

import java.util.Scanner;

public class Celsius{

  public static void main(String[] avocado){

    Scanner eyes = new Scanner(System.in);
    System.out.println("Welcome to Canada!  You will hear lots of Celsius temperatures here.  Tell me the Celsius temp that you want converted to Fahrenheit:");

    double cels = eyes.nextInt();
    double fahr = cels * 9/5 + 32;
      
    System.out.println("\n"+ cels + " C = " + fahr + " F");
    
    
  }
  
}


