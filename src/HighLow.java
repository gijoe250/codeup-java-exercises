import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
//        The specs for the game are:
//
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number.
//        All user inputs are validated.
//                If user's guess is less than the number, it outputs "HIGHER".
//        If user's guess is more than the number, it outputs "LOWER".
//        If a user guesses the number, the game should declare "GOOD GUESS!"
//        Hints
//
//        Use the random method of the java.lang.Math class to generate a random number.
//        Bonus
//
//        Keep track of how many guesses a user makes.
//                Set an upper limit on the number of guesses.
        System.out.println("Guess the number between 1 - 100 Mr. User. You have 6 guesses.");
        Scanner in = new Scanner(System.in);
        int guess = in.nextInt();
        int answer = randomNumber(100) + 1;
        int guesses = 0;

        while(answer != guess && guesses < 6){
            if (guess > answer){
                System.out.println("Guess lower");
                guess = in.nextInt();
                guesses++;
                continue;
            }
            if(guess < answer){
                System.out.println("Guess higher");
                guess = in.nextInt();
                guesses++;
            }
        }
        if ( guesses < 6){
            System.out.println("Congratulations! you are correct!");
            System.out.printf("It took you %d guess to get the answer right", guesses);
        }
        else {
            System.out.println("You ran out of guesses");
        }

    }
        public static int randomNumber ( int sides){
            Random rand = new Random();

            return rand.nextInt(sides) + 1;
        }
}
