//Think Java: 3.12	4	Guess.java
/*
Exercise 4   The goal of this exercise is to program a “Guess My Number” game. When it’s finished, it will work like this:
I'm thinking of a number between 1 and 100
(including both). Can you guess what it is?
Type a number: 45
Your guess is: 45
The number I was thinking of is: 14
You were off by: 31
To choose a random number, you can use the Random class in java.util. Here’s how it works:
Like the Scanner class we saw in this chapter, Random has to be imported before we can use it. And as we saw with Scanner, we have to use the new operator to create a Random (number generator).

Then we can use the method nextInt to generate a random number. In this example, the result of nextInt(100) will be between 0 and 99, including both. Adding 1 yields a number between 1 and 100, including both.

1. The definition of GuessStarter is in a file called GuessStarter.java, in the directory called ch03, in the repository for this book.
2. Compile and run this program.
3. Modify the program to prompt the user, then use a Scanner to read a line of user input. Compile and test the program.
4. Read the user input as an integer and display the result. Again, compile and test.
5. Compute and display the difference between the user’s guess and the number that was generated.

*/

import java.util.Random;
import java.util.Scanner;

public class Guess {

  public static void main(String[] args) {
    
    System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
    System.out.println("Type a number: ");
    Scanner eyes = new Scanner(System.in);    
    int guess = eyes.nextInt();
    
    System.out.println("Your guess is: " + guess);
    
    Random random = new Random();
    int rando = random.nextInt(100) + 1;  
    System.out.println("The number I was thinking of is: " + rando);
    
    int off = Math.abs(rando - guess);
    System.out.println("You were off by: " + off);
    
  }
}