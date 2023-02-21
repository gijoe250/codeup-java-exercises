package Library;

public class Book extends Media{
    @Override
    public void store() {
        System.out.println("Put the book back on the book shelf where it belongs");
    }

    @Override
    public void use() {
        System.out.println("Find a comfy couch to lie down on and read the book");
    }
}
