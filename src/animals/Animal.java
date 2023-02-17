package animals;

public class Animal {

//- add getters and setters
//- add a constructor that sets all properties
    private int numberOfLegs;
    private String preferredClimate;

    public int getNumberOfLegs(){
        return this.numberOfLegs;
    }
    public void setNumberOfLegs(int legs){
        this.numberOfLegs = legs;
    }
    public String getPreferredClimate(){
        return this.preferredClimate;
    }
    public void setPreferredClimate(String climate){
        this.preferredClimate = climate;
    }

    public Animal(int legs, String climate){
        this.numberOfLegs = legs;
        this.preferredClimate = climate;
    }

    public String getAnimalInfo(){
//            - ```public String getAnimalInfo()```: a method that returns a message with number of legs and preferred climate info
        return "Hello";
    }
}
