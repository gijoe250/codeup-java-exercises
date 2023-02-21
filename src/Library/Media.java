package Library;

abstract class Media {
    public void search(){
        System.out.println("Looking for item");
    }
    public abstract void store();

    public abstract void use();
}
