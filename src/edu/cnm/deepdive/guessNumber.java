package edu.cnm.deepdive;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {

  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    boolean playAgain;

    System.out.println("Type a number from 1 to 100.");
    do {
      int secret;

      secret = 1 + random.nextInt(100);
      play(secret);
      System.out.println("Play Again? (y/n)");
      String playAgainInput;
      while (!input.hasNextLine()){
        //Do nothing while scanner buffer is empty.
      }
      playAgainInput = input.nextLine().toLowerCase();
      playAgain = playAgainInput.length() > 0 && playAgainInput.charAt(0) == 'y';
    } while (playAgain);
    System.out.println("Game Over!");
  }

  public static void play(int secret) {
    boolean correct;

    do {
      int guess;

      guess = input.nextInt();
      if (guess == secret) {
        correct = true;
        System.out.println("Good Job! The secret number was " + secret);
      } else {
        correct = false;
        if (guess < secret) {
          System.out.println("Too low! guess a higher number");
        } else {
          System.out.println("Too high! guess a lower number");
        }
      }
    } while (!correct);
  }
}
