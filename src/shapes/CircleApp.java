package shapes;

//    Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using your Input class,
//    creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)

import util.Input;

public class CircleApp {
    private static int circleCount = 0;

    public static void main(String[] args){
        Input input = new Input();
        double radius = input.getDouble(1,20,"We need a value for the radius");
        Circle circle0 = new Circle(radius);
        setCircleCount(getCircleCount() + 1);
        System.out.println("The area of the circle is " + circle0.getArea());
        System.out.println("The circumference of the circle is " + circle0.getCircumference());
//        After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make another.
//        Continue creating circles and displaying information about them until the user says they do not want to continue.
        while (input.yesNo()){
            radius = input.getDouble(1,20,"We need a value for the radius");
            Circle circle = new Circle(radius);
            setCircleCount(getCircleCount() + 1);
            System.out.println("The area of the circle is " + circle.getArea());
            System.out.println("The circumference of the circle is " + circle.getCircumference());
        }
//        Before exiting, the program should output the total number of circles created.
//        Use a private static field, along with a public static method to keep track of and display the total number of circles created.
        System.out.println("The number of circles you created is " + getCircleCount());
    }

    public static int getCircleCount() {
        return circleCount;
    }

    public static void setCircleCount(int circleCount) {
        CircleApp.circleCount = circleCount;
    }
}
