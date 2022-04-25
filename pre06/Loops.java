//Think Java: 7.9	1,2,3,4
/*
For exercises 2,3, and 4 create a file named Loops.java and create methods for each exercise. Name them as you see fit. When the program is run, all the methods should be called and results printed out.
  */

public class Loops{

  public static void main(String[] antman){

    System.out.println( squareRoot(9.0));
    System.out.println( squareRoot(2.0));
    System.out.println( squareRoot(144.0));

    System.out.println( power(2,3));
    System.out.println( power(5,3));
    System.out.println( power(2,8));

    System.out.println( factorial(5));
    System.out.println( factorial(6));
    System.out.println( factorial(20));
    
  }

//Exercise 2
/* Let’s say you are given a number, a, and you want to find its square root. One way to do that is to start with a rough guess about the answer, x0, and then improve the guess using this formula: x1 =(x0 + a/x0) / 2 
For example, if we want to find the square root of 9, and we start with x0 = 6, then x1 = (6 + 9/6) / 2 = 3.75, which is closer. We can repeat the procedure, using x1 to calculate x2, and so on. In this case, x2 = 3.075 and x3 = 3.00091. So it converges quickly on the correct answer.

Write a method called squareRoot that takes a double and returns an approximation of the square root of the parameter, using this technique. You should not use Math.sqrt.

As your initial guess, you should use a/2. Your method should iterate until it gets two consecutive estimates that differ by less than 0.0001. You can use Math.abs to calculate the absolute value of the difference. */

  public static double squareRoot(double a){

    double oldGuess = a;
    double newGuess = a/2;
    double err = Math.abs(newGuess - oldGuess);
    //System.out.println(oldGuess + "\t" + newGuess + "\t" + err);
    
    while (err > 0.0001){
      oldGuess = newGuess;
      newGuess =(oldGuess + a/oldGuess) / 2; 
      err = Math.abs(newGuess - oldGuess);
      //System.out.println(oldGuess + "\t" + newGuess + "\t" + err);
    }
    return newGuess;
  }

  
//Exercise 3  
/* In Exercise 9 we wrote a recursive version of power, which takes a double x and an integer n and returns xn. Now write an iterative method to perform the same calculation. */

  public static double power(double base, int exp){

    double ans = base;

    for(int i = 1; i <= exp; i++){
      ans *= base;
    }
    return ans;
       
  }

  
//Exercise 4  
/* Section 6.7 presents a recursive method that computes the factorial function. Write an iterative version of factorial. */

  public static int factorial(int n){

    int ans = 1;
    
    for(int i = 1; i<= n; i++){
      ans *= i;  
    }

    return ans;
    
  }  

  
}