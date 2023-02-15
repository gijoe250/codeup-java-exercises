

public class DishTest {
//    Create another class called DishTest
//    Add a main method and inside the method...
//    1) instantiate a Dish object and assign to a variable called dish1
//    2) assign creative values for each of the properties
//    3) test the printSummary() method by invoking it and checking if all instance values are correctly printed

//    Refactor your Dish and DishTest classes...
//  1) Change all properties in the Dish class to private visibility (printSummary should remain public)
//  2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)
//  3) Refactor code as needed in DishTest to access and modify dish object property values
//  4) Add a constructor method to Dish that will assign all properties
//  5) Refactor DishTest again to use the constructor to set all property values rather than setter methods
    public static void main(String[] args){
        Dish dish1 = new Dish(99, "pansit", true);
        dish1.printSummary();

        Dish dish2 = new Dish(101, "pizza", true);
        dish2.printSummary();

        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommendation(dish1);
        System.out.println("dish recommendation flipped to opposite: " + dish1.isWouldRecommend());
        Dish.compareDishes(dish1, dish2);
    }
}
