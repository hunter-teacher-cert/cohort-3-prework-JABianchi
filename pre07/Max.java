/*
Exercise 4   Write a method called indexOfMax that takes an array of integers and returns the index of the largest element. Can you write this method using an enhanced for loop? Why or why not?
  */

//ANSWER: You COULD write the method using an enhanced for loop (see commented out section below), but it would be silly to do so.  You would need to create an extra variable to keep track of the index of the array that you are traversing through.  A regular for-loop builds this in automatically, so would be the simpler choice. 

public class Max{

  public static void main(String[] astrophysics){

    int[] testArr = {19,22,3,4,6,66,78,90,12,1,1,1,0};

    System.out.println( indexOfMax(testArr));
    
    
  }

  public static int indexOfMax(int[] arr){

    int max = arr[0];
    int iMax = 0;
    
    for(int i=1; i<arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
        iMax = i;
      }
      
    }
    
    /*
    int i = 0;
    for(int x: arr){
      if(x > max){
        max = x;
        iMax = i;
      }
      i++;      
    }
    */

    return iMax;
    
  }

  
}