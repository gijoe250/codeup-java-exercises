import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
//        Loop Basics
//        While
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }
        for( int i=5; i<=15; i++){
            System.out.println(i);
        }
//        Your output should look like this:
//        5 6 7 8 9 10 11 12 13 14 15
//
//        Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
//        int count = 0;
//        int count = 100;
//        long count = 2L;
//        do {
//            System.out.println(count);
////            count += 2;
////            count -= 5;
//            count = count * count;
//        }while (count < 1000000);
        for (long i=2L; i < 1000000; i *= i){
            System.out.println(i);
        }
//        Output should equal:
//        2
//        4
//        16
//        256
//        65536

//        For
//        Refactor the previous two exercises to use a for loop instead.

//        Fizzbuzz
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
        for(int i=1; i<=100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i%5 == 0){
                System.out.println("Buzz");
            }
            else if (i%3 == 0){
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }
//        Display a table of powers.
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
        Scanner in = new Scanner(System.in);
        String string = "y";

        while(string.equals("y")){
            System.out.println("Enter a number that you would like to go up to: ");
            int numberMax = in.nextInt();

            for (int number = 1; number <= numberMax; number++){
                int squared = number * number;
                int cubed = number * number * number;
                if (number == 1){
                    System.out.format("" +
                            "number | squared | cubed\n" +
                            "------ | ------- | -----\n" +
                            "%d      | %d       | %d   \n",number, squared, cubed);
                }
                else if (squared >= 10){
                    System.out.format("%d      | %d      | %d   \n",number, squared, cubed);
                }
                else {
                    System.out.format("%d      | %d       | %d   \n",number, squared, cubed);
                }
            }
            System.out.println("Do you want to continue?(y/n)");
            string = in.next();
        }

//        Example Output
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

//        Convert given number grades into letter grades.
//          Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
        String cont = "y";
        while (cont.equals("y")){
            System.out.println("Enter a numerical grade between 0 to 100");
            int grade = in.nextInt();

            if (grade >= 88 && grade <= 100){
                System.out.println("A");
            }
            else if (grade < 88 && grade >= 80){
                System.out.println("B");
            }
            else if (grade < 80 && grade >= 67){
                System.out.println("C");
            }
            else if (grade < 67 && grade >= 60){
                System.out.println("D");
            }
            else if (grade < 60 && grade >= 0){
                System.out.println("F");
            }
            else {
                System.out.println("Not in the given grade range");
            }

            System.out.println("Do you want to continue?(y/n)");
            cont = in.next();
        }



//        Grade Ranges:
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

    }
}
