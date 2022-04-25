import java.util.Scanner;

/*
You will write a program named Craps.java that will play a simplified game of craps.*/
public class Craps{

  private static int point = 0;
  private static int wins = 0;
  private static int losses = 0;
  
//There should be at least three static methods in addition to main.

  //The main program should take a parameter from the command line, play that many rounds and as it plays indicate each time the shooter wins or loses. The program should also print out the status of the rounds they occur.
  public static void main(String[] accident){

    Scanner eyes = new Scanner(System.in);

    System.out.println("Welcome to Craps!");
    System.out.println("How many rounds do you want to play? (Type an integer)");
    int rounds = eyes.nextInt();

    for(int r = 1; r <= rounds; r++){

      System.out.println("\nRound " + r);
      String result = round();
      System.out.println(result);
      printTotals();
      
    }
    
  }


  //One named roll which accepts an integer parameter and returns a random number between 1 and that number, inclusive. 
  public static int roll(int num){
    return (int) (Math.random()*num + 1);
  }
  
  //There should also be one named shoot which accepts two parameters - a number of dice and the maximum value for those dice and returns the result of rolling those dice.
  public static int shoot(int numDice, int maxVal){

    int total = 0;
    
    for(int i = 1; i<= numDice; i++){
      total += roll(maxVal);
    }

    System.out.println("You rolled a " + total);
    return total;
    
  }

/* The third method should be named round. It should accept no parameters and it should return something to indicate if the shooter of the round wins or loses.

A round is played as follows:

The shooter shoots (rolls) the dice.

If he rolls a 2,3, or 12,that’s Craps and he loses.
If he rolls a 7 or 11, that’s a Natural and he wins.
Otherwise:

the value he rolled is now called the Point
the shooter continues to shoot (roll) until he either rolls the Point again at which point he wins or he rolls a 7 at which point he loses.

*/
  
  public static String round(){

    int s1 = shoot(2,6);
    
    if(s1==2 || s1==3 || s1==12){
      losses++;
     return "Craps! Because your first roll was a " + s1 + ", you lose!"; 
    } else if (s1 == 7 || s1 == 11){
      wins++;
      return "Because your first roll was a Natural, " + s1 + ", you win!";
    } else {

      point = s1;

      int s2 = 0;
      while(s2 != point && s2 != 7){
        s2 = shoot(2,6);

        if(s2 == point){
          wins++;
          return "You rolled the point again!  You win!";
        } else if( s2 == 7){
          losses++;
          return "You rolled a 7, you lose!";
        } else {
          //keep rolling
        }

      }
      return "Error with round() method";
    }
    
  }


  public static void printTotals(){
    double pct = ((double) wins) / (wins + losses);
    System.out.println("You have " + wins + " wins and " + losses + " losses, with a " + String.format("%.1f", pct*100) + "% winning percentage.");
  }

  
}



//For more information, here’s a great documentary on the subject: https://www.youtube.com/watch?v=PvpmD6NXPfw