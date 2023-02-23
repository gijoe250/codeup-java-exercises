public class Test {
    public static void main(String[] args){
        try {
            String string = "Joe";

            System.out.println(string.length());
            System.out.println(string.substring(0, 5));

        }catch (Exception e){
            System.out.println("You broke it");
            System.out.println(e.getMessage());
        }
        System.out.println("I made it here");
    }
}
