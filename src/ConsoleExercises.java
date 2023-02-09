import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double pi = 3.14159;

        System.out.println("The value of pi is approximately " + pi);
        System.out.format("The value of pi is approximately %.2f \n", pi);

//        System.out.println("Enter an integer: ");
//        int number = in.nextInt();
//        System.out.println(number);

//        System.out.println("Enter 3 words: ");
//        String string = in.next();
//        String string2 = in.next();
//        String string3 = in.next();
//        System.out.println(string + string2 + string3);

//        System.out.println("Enter sentence: ");
//        String string = in.nextLine();
//        System.out.println(string);

//        System.out.println("Enter width and length of room");
//        int width = in.nextInt();
//        int length = in.nextInt();
//        System.out.printf("The width is %d and the length is %d", width, length );

//        System.out.println("Enter width and length of room");
//        int width = parseInt(in.nextLine());
//        int length = parseInt(in.nextLine());
//        System.out.printf("The width is %d and the length is %d \n", width, length );
//        int area = width * length;
//        int parameter = 2 * width + 2 * length;
//        System.out.printf("The area is %d and the parameter is %d \n", area, parameter);

//        System.out.println("Enter width and length of room: ");
//        double width = parseDouble(in.nextLine());
//        double length = parseDouble(in.nextLine());
//        System.out.printf("The width is %.2f and the length is %.2f \n", width, length );
//        double area = width * length;
//        double parameter = 2 * width + 2 * length;
//        System.out.printf("The area is %.2f and the parameter is %.2f \n", area, parameter);

        System.out.println("Enter width and length of room: ");
        int width = in.nextInt();
        int length = in.nextInt();
        System.out.printf("The width is %s and the length is %s \n", width, length );
        int area = width * length;
        int parameter = 2 * width + 2 * length;
        System.out.printf("The area is %d and the parameter is %d \n", area, parameter);

//        String input = in.nextLine();
//
//        System.out.println(input + " here\n");
//
//        in.useDelimiter("n");
//        System.out.println(in.next() + "test");      // prints: red
//        System.out.println(in.next() + "what");      // prints: blue

    }
}
