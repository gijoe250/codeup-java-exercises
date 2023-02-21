package Library;

public class CD extends Media{
    @Override
    public void store() {
        System.out.println("put me back in the case");
    }

    @Override
    public void use() {
        System.out.println("put the cd in a cd player, plug in my headset, and lets jam!");
    }
}
