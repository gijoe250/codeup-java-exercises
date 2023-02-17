import java.util.Random;

public class ServerNameGenerator {
//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//    Create a method that will return a random element from an array of strings.
//    Add a main method,
//    and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    private String[] adjectives = {"blue", "red", "orange", "big", "small", "cool", "generous", "green", "yellow", "gold"};
    private String[] nouns = {"animal", "car", "plane", "bird", "cup", "duck", "gum", "phone", "laptop", "desk"};

    public String[] getAdjectives() {
        return adjectives;
    }

    public void setAdjectives(String[] adjectives) {
        this.adjectives = adjectives;
    }

    public String[] getNouns() {
        return nouns;
    }

    public void setNouns(String[] nouns) {
        this.nouns = nouns;
    }

    public String randomElement(String[] stringArray){
        Random random = new Random();

        int randStringIndex = random.nextInt(stringArray.length);

        return stringArray[randStringIndex];
    }
    public static void main(String[] args){
        ServerNameGenerator nameGen = new ServerNameGenerator();
        System.out.println("Your randomly generated server name is:\n" +nameGen.randomElement(nameGen.adjectives) + "-" + nameGen.randomElement(nameGen.nouns));
    }
}
