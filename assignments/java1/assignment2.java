import java.util.Scanner;

public class assignment2 {
  public static void main(String[] args) {
    int counter = 5;
    int value = (int)(Math.random() * 100) + 1;
    int guess = 0;
    boolean solved = false;
    Scanner input = new Scanner(System.in);
    while (!solved && counter > 0) {
      try {
        System.out.println("Guess a number from 1 to 100!");
        guess = input.nextInt();
        if (Math.abs(value - guess) < 10) {
          solved = true;
        } else {
          counter--;
          if (counter > 0) {
            System.out.println("Not quite! Try again! (" + counter + " guesses remaining.)");
          }
        }
      }
      catch(Exception exc) {
        System.out.println("I need an integer, please!");
        input.nextLine();
        continue;
      }
    }
    input.close();
    if (solved) {
      if (guess == value) {
        System.out.println("Whoa, that's exactly right! You win!");
      } else {
        System.out.println("Close enough! The answer was " + value + ". You win!");
      }
    } else {
      System.out.println("Sorry! The answer was " + value + ". Better luck next time!");
    }
  }
}
