

public class Dish {
//    Create a class called Dish. This class will represent various restaurant dishes.
//    Include an integer property called “costInCents”
//    Include a string property called “nameOfDish”
//    Include a boolean property called “wouldRecommend”
//    Include a method called “printSummary” with a void return type
//    this method will use a single printf method to print out the values of each of the instance properties in the following format:
//    Cost: COST_IN_CENTS_HERE
//    Name: NAME_OF_DISH_HERE
//    Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    void printSummary(){
        System.out.printf(" Cost: %d\n" +
                " Name %s\n" +
                " Recommended: %b\n\n",getCostInCents(), getNameOfDish(), isWouldRecommend());
    }

    public static void compareDishes(Dish dish1, Dish dish2){
        if (dish1.costInCents > dish2.costInCents){
            System.out.format("%s costs more than %s\n", dish1.getNameOfDish(), dish2.getNameOfDish());
        }
        else if (dish1.costInCents < dish2.costInCents){
            System.out.format("%s costs less than %s\n", dish1.getNameOfDish(), dish2.getNameOfDish());
        }
        else {
            System.out.format("%s is the same cost of %s\n", dish1.getNameOfDish(), dish2.getNameOfDish());
        }
    }
}
