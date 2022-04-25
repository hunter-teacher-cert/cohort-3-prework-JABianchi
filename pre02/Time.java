//Think Java: 2.12	3	Time.java
/*
Exercise 3  
The point of this exercise is to (1) use some of the arithmetic operators, and (2) start thinking about compound entities (like time of day) that are represented with multiple values.

Create a new program called Time.java. From now on, we won’t remind you to start with a small, working program, but you should.
Following the example program in Section 2.4, create variables named hour, minute, and second. Assign values that are roughly the current time. Use a 24-hour clock so that at 2pm the value of hour is 14.
Make the program calculate and display the number of seconds since midnight.
Calculate and display the number of seconds remaining in the day.
Calculate and display the percentage of the day that has passed. You might run into problems when computing percentages with integers, so consider using floating-point.
Change the values of hour, minute, and second to reflect the current time. Then write code to compute the elapsed time since you started working on this exercise.
Hint: You might want to use additional variables to hold values during the computation. Variables that are used in a computation but never displayed are sometimes called “intermediate” or “temporary” variables.
  */

public class Time{

  public static void main(String[] arithmetic){
    
    int h = 18;
    int m = 42;
    int s = 30;
    
    //Current Time
    printTime("The current time is", h,m,s);

    //Seconds since midnight
    int totalS = s + 60*(m + h*60);
    System.out.println("There have been " + totalS + " seconds since midnight");

    //Seconds remaining in the day
    int secInDay = 60 * 60 * 24;
    int secLeft = secInDay - totalS;
    System.out.println("There are " + secLeft + " seconds left in the day!");

    //Percentage of Day passed
    float pctDay = ((float) totalS)/secInDay * 100;
    System.out.printf("%.1f", pctDay);
    System.out.println("% of the day has passed.");

    //time passed
    int newH = 21;
    int newM = 03;
    int newS = 45;

    int difH = newH - h;
    int difM = newM - m;
    int difS = newS = s;

    int elapsedSeconds = difS + 60 * (difM + 60 * difH);

    int eS = elapsedSeconds%60;
    elapsedSeconds /= 60;
    int eM = elapsedSeconds%60;
    elapsedSeconds /= 60;
    int eH = elapsedSeconds;

    printTime("The amount of time that has passed since I started this exercise is ", eH, eM, eS);
    
    
    
  }

  public static void printTime(String intro, int h, int m, int s){
    System.out.print(intro + " ");
    System.out.printf("%02d", h);
    System.out.print(":");
    System.out.printf("%02d", m);
    System.out.print(":");
    System.out.printf("%02d", s);
    System.out.println(".");

    
  }
  
}