import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
//        System.out.println(addition(10, 15));
//        System.out.println(subtraction(15, 10));
//        System.out.println(multiplication(5, 10));
//        System.out.println(multiplicationRecursion(4,5));
//        System.out.println(division(10,5));
//        System.out.println(division(5,23));
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println(userInput + " is within range");
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInputRecursion = getIntegerRecursion(1, 10);
//        System.out.println(userInputRecursion + " is within range");
//        factorial(1,10);
        rollDice();


    }
    public static int addition(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2) {
        int answer = 0;

        for(int i=0; i < number2; i++){
            answer = answer + number1;
        }
        return answer;
    }

    public static int multiplicationRecursion(int number1, int number2) {
        if( number2 == 1)
            return number1;
        return number1 + multiplicationRecursion(number1, number2 - 1);
    }

    public static int division(int number1, int number2) {
        return number1/number2;
    }

    //    Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range.
//    If not, prompt the user to input their number again until the input is within range.
//    If the input is invalid, prompt the user again.
//    Hint: recursion might be helpful here!
    public static int getInteger(int min, int max){
        Scanner in = new Scanner(System.in);

        while(true){
            int userValue = in.nextInt();

            if (userValue >= min && userValue <= max)
                return userValue;
            System.out.println("Input is not within the range. Enter an appropriate value");
        }
    }

    public static int getIntegerRecursion(int min, int max){
        Scanner in = new Scanner(System.in);

        int userValue = in.nextInt();

        if (userValue >= min && userValue <= max)
            return userValue;
        else {
            System.out.println("Input is not within the range. Enter an appropriate value");
            return getIntegerRecursion(min, max);
        }
    }
    //    Calculate the factorial of a number.
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!).
//    Ex:
//
//
//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24
//    Bonus
//
//    Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//    Use recursion to implement the factorial.
    public static void factorial(int min, int max){
        Scanner in = new Scanner(System.in);
        int userValue;
        String again = "y";

        while(again.equals("y")){
            System.out.println("Enter a integer between 1 and 10: ");

            while(true){
                userValue = in.nextInt();

                if (userValue >= min && userValue <= max) {
                    System.out.format("The value %d is within range. \n", userValue);
                    break;
                }
                System.out.println("Input is not within the range. Enter an appropriate value");
            }

            long factorialTotal = 0;
            String factorialString = "";

            for (int i = 1; i <= userValue; i++){
                if (i == 1){
                    factorialString = userValue + "! = 1";
                    factorialTotal = 1;
                }
                else {
                    factorialString += " x " + i;
                    factorialTotal *= i;
                }
            }
            factorialString += " = " + factorialTotal;
            System.out.println(factorialString);

            System.out.println("Do you want to do it again?(y/n)");
            again = in.next();
        }
    }

    public static void rollDice(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of sides for the dice");
        int diceSides = in.nextInt();

        while(true){
            System.out.println("Roll the dice? (y/n)");
            String roll = in.next();
            if (roll.equals("y")){
                System.out.println(randomNumber(diceSides));
                System.out.println(randomNumber(diceSides));
            }
            else {
                break;
            }
        }

    }

    public static int randomNumber(int sides){
        Random rand = new Random();

        int upperbound = sides;

        return rand.nextInt(upperbound) + 1;
    }

//    Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//      "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.
}
