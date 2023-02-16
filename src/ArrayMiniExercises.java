public class ArrayMiniExercises {
    /* TODO: create an array of doubles called numbers and assign five different values (try with and without an initializer).
    Find the sum of all five double values using an enhanced for loop.
    */
    public static void main(String[] args){
        double[] numbers = new double[5];
        double[] numbers2 = {3,1,7,10,4};
        double sum = 0, sum2 = 0;

        numbers[0] = 2;
        numbers[1] = 7;
        numbers[2] = 10;
        numbers[3] = 35;
        numbers[4] = 1;

        for (double number : numbers){
            sum += number;
            System.out.println(sum);
        }

        for (double number : numbers2){
            sum2 += number;
            System.out.println(sum2);
        }
    }
}
