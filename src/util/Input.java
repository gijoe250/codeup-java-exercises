package util;

import java.util.Scanner;

public class Input {
    private static Scanner scan;

    public Input(){
        scan = new Scanner(System.in);
    }

    public static String getString(){
        System.out.println("Enter a string");
        return scan.next();
    }
    public static boolean yesNo(String answer){
        return answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes");
    }
    int getInt(int min, int max){
        System.out.format("Enter an integer between %d and %d",min, max);
        int value = getInt();

        while (value < min || value > max){
            System.out.println("Integer not within range. Enter a new integer");
            value = getInt();
        }
        return value;
    }
    int getInt(){
        return scan.nextInt();
    }
    double getDouble(double min, double max){
        System.out.format("Enter a double between %f and %f",min, max);
        double value = getDouble();

        while (value < min || value > max){
            System.out.println("Double not within range. Enter a new Double");
            value = getDouble();
        }
        return value;
    }
    double getDouble(){
        return scan.nextDouble();
    }
}
