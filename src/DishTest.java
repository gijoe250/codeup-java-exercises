

public class DishTest {
//    Create another class called DishTest
//    Add a main method and inside the method...
//    1) instantiate a Dish object and assign to a variable called dish1
//    2) assign creative values for each of the properties
//    3) test the printSummary() method by invoking it and checking if all instance values are correctly printed
    public static void main(String[] args){
        Dish dish1 = new Dish();
        dish1.costInCents = 99;
        dish1.nameOfDish = "pansit";
        dish1.wouldRecommend = true;
        dish1.printSummary();

        Dish dish2 = new Dish();
        dish2.costInCents = 101;
        dish2.nameOfDish = "pizza";
        dish2.wouldRecommend = true;
        dish2.printSummary();

        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommendation(dish1);
        System.out.println(dish1.wouldRecommend);
        Dish.compareDishes(dish1, dish2);
    }
}
