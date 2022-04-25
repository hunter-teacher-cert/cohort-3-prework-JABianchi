/*
Exercise 5   The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all prime numbers up to any given limit,” which you can read about at https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes.
Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.
  */

public class Seive{

  public static void main(String[] antarctica){

    printArr( sieve(20));
    
  }

  public static boolean[] sieve(int n){
    boolean[] isPrime = new boolean[n];

    //by definition, 0 and 1 are not prime
    isPrime[0] = false;
    isPrime[1] = false;

    //initialize the values from 2-n as true/prime by default
    for(int i=2; i<n; i++){
      isPrime[i] = true;
    }    
    
    //loop through all the numbers from 2-n
    for(int i=2; i<n; i++){
      System.out.print(i);
        
      //find multiples of each number and set to false/composite
      for(int m = 2*i; m<n; m+=i){
        System.out.print(m + " ");
        isPrime[m] = false;
      }

      System.out.println();
    }
    
    return isPrime;
    
  }

  private static void printArr(boolean[] a){
    System.out.print("[ ");
    for(int i = 0; i<a.length-1; i++){
      System.out.print(a[i] + "\t");
    }
    System.out.println(a[a.length-1] + " ]");
  }



  
}