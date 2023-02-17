package util;

import java.util.Scanner;

public class Input {
    private static Scanner scan;

    public Input(){
        scan = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a string: ");
        return scan.next();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        scan.next();
        return scan.nextLine();
    }
    public boolean yesNo(){
        System.out.println("Enter yes or y if you want to continue:");
        String answer = scan.next();
        return answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes");
    }
    int getInt(int min, int max){
        System.out.format("Enter an integer between %d and %d: ",min, max);
        int value = getInt();

        while (value < min || value > max){
            System.out.println("Integer not within range. Enter a new integer: ");
            value = getInt();
        }
        return value;
    }
    int getInt(){
        return scan.nextInt();
    }
    public int getInt(String prompt){
        System.out.println(prompt);
        return scan.nextInt();
    }
    int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        System.out.format("Enter an integer between %d and %d: ",min, max);
        int value = getInt();

        while (value < min || value > max){
            System.out.println("Integer not within range. Enter a new integer: ");
            value = getInt();
        }
        return value;
    }
    public double getDouble(double min, double max){
        System.out.format("Enter a double between %f and %f: ",min, max);
        double value = getDouble();

        while (value < min || value > max){
            System.out.println("Double not within range. Enter a new Double: ");
            value = getDouble();
        }
        return value;
    }
    public double getDouble(){
        return scan.nextDouble();
    }

    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        System.out.format("Enter a double between %f and %f: ",min, max);
        double value = getDouble();

        while (value < min || value > max){
            System.out.println("Double not within range. Enter a new Double: ");
            value = getDouble();
        }
        return value;
    }
}
