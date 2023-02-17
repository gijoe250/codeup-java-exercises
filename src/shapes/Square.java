package shapes;

public class Square extends Rectangle{

    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getArea(){
        return this.side ^ 2;
    }

    public int getPerimeter(){
        System.out.println("I am square");
        return this.side * 4;
    }
}
