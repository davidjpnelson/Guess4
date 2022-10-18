public class Guess4 {

  public static void main(String[] args)
      throws java.io.IOException {

    char ch, ignore, answer = 'K';

    do {
      System.out.println("I'm thinking of a capitalized letter between A and Z");
      System.out.print("Can you guess it?\n");

      ch = (char) System.in.read(); // get a character

      do {
        ignore = (char) System.in.read(); //discard any other characters in the input buffer
      } while (ignore != '\n');

      if (ch == answer) {
        System.out.println("***CORRECT***");
      } else {
        System.out.print("Sorry, you're ");
        if (ch < answer) {
          System.out.println("too low.");
        } else {
          System.out.println("too high.");
        } System.out.println("Try again!\n");

      }
    } while (answer != ch);

  }

}
