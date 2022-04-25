
public class Array{

  public static void main(String[] articles){

    double[] testArr = {1,2,3,4,5};
    printArr(powArray(testArr,2));


    int[] testArr2 = {0,5,5,5,5,6,8,2,4,1,3,4,4,4,4,9,0};
    printArr(histogram(testArr2,10));
    
  }

  /* write a method called powArray that takes a double array, a, and returns a new array that contains the elements of a squared. Generalize it to take a second argument and raise the elements of a to the given power. */
  public static double[] powArray(double[] a, int pow){
    
    double[] newArr = new double[a.length];

    for(int i=0; i<newArr.length; i++){
        newArr[i] = Math.pow(a[i],pow);
    }

    return newArr;
    
  }

  private static void printArr(double[] a){
    System.out.print("[ ");
    for(int i = 0; i<a.length-1; i++){
      System.out.print(a[i] + "\t");
    }
    System.out.println(a[a.length-1] + " ]");
  }



  /* write a method called histogram that takes an int array of scores from 0 to (but not including) 100, and returns a histogram of 100 counters. Generalize it to take the number of counters as an argument. */
  //histogram: An array of integers where each integer counts the number of values that fall into a certain range.
  public static int[] histogram(int[] arr, int numCounters){

    int[] counters = new int[numCounters];

    for(int x: arr){
      counters[x]++;
    }
    return counters;
    
  }

  private static void printArr(int[] a){
    System.out.print("[ ");
    for(int i = 0; i<a.length-1; i++){
      System.out.print(a[i] + "\t");
    }
    System.out.println(a[a.length-1] + " ]");
  }



 

  
  
}