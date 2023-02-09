public class MethodsExercises {
    public static void main(String[] args){
        System.out.println(addition(10, 15));
        System.out.println(subtraction(15, 10));
        System.out.println(multiplication(5, 10));
        System.out.println(division(10,5));
        System.out.println(division(5,23));
    }
//TODO: recursion
    public static int addition(int number1, int number2) {
        return number1 + number2;
    }
    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2) {
        int answer = 0;

        for(int i=0; i < number2; i++){
            answer = answer + number1;
        }
        return answer;
    }

    public static int division(int number1, int number2) {
        return number1/number2;
    }
}
