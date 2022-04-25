//Think Java: 5.12	5	Beer.java
/* The purpose of this exercise is to take a problem and break it into smaller problems, and to solve the smaller problems by writing simple methods. Consider the first verse of the song “99 Bottles of Beer”:

99 bottles of beer on the wall,
99 bottles of beer,
ya’ take one down, ya’ pass it around,
98 bottles of beer on the wall.

Subsequent verses are identical except that the number of bottles gets smaller by one in each verse, until the last verse:

No bottles of beer on the wall,
no bottles of beer,
ya’ can’t take one down, ya’ can’t pass it around,
’cause there are no more bottles of beer on the wall!
And then the song (finally) ends.

Write a program that displays the entire lyrics of “99 Bottles of Beer”. Your program should include a recursive method that does the hard part, but you might want to write additional methods to separate other parts of the program. As you develop your code, test it with a small number of verses, like 3.
  */


public class Beer{

  public static void main(String[] airplanes){

    recursiveSong(99);
    
  }

  public static void recursiveSong(int num){
    if(num > 0){
      System.out.println(num+ " bottles of beer on the wall,");
      System.out.println(num + " bottles of beer,");
      System.out.println("ya’ take one down, ya’ pass it around,");
      System.out.println(num-1 + " bottles of beer on the wall.\n");
      recursiveSong(num-1);
    } else {
      System.out.println("No bottles of beer on the wall,");
      System.out.println("No bottles of beer,");
      System.out.println("ya’ can't take one down, ya’ can't pass it around,");
      System.out.println("'cause there are no more bottles of beer on the wall!");     
    }
  }
}