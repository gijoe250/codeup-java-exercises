public class HelloWorld {
    public static void main(String[] args){
        System.out.print("Hello World!");
        System.out.println("Hello World!");

//        Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 250;

        System.out.println(myFavoriteNumber);
//        Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "All the worlds";
        System.out.println(myString);
//        Change your code to assign a character value to myString. What do you notice?
        myString = "J";
        System.out.println(myString);
//        Change your code to assign the value 3.14159 to myString. What happens?
        myString = "3.14159"; //doesnt work as a number
        System.out.println(myString);
//        Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber = 123L;
//        System.out.println(myNumber); //shows variable is not initialized3.14159
//        Change your code to assign the value 3.14 to myNumber. What do you notice?
            // still does not work because no conversion
//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//
//        Change your code to assign the value 123 to myNumber.
//        long myNumber = 123;
//        System.out.println(myNumber);
//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//
//                Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        float myNumber = 3.14;
//        double myNumber = (float) 3.14; //one way to fix it
        double myNumber = 3.14;
        float betterNumber = (float) myNumber;
        System.out.println(betterNumber);
//      Copy and paste the following code blocks one at a time and execute them

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        What is the difference between the above code blocks? Explain why the code outputs what it does.
        // x++ increments after the print (post) while ++x increments before the print (pre)
//                Try to create a variable named class. What happens?
        //declared type cannot be used
//
//        Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        Copy and paste the code above and then run it. Does the result match with your expectation?
//
//        How is the above example different from the code block below?
//        int three = (int) "three";
//        What are the two different types of errors we are observing?
//
//        Rewrite the following expressions using the relevant shorthand assignment operators:
//
//
//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);
//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//        byte num = 10000;
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.



                }
}
