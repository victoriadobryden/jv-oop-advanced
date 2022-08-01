package core.basesyntax;

public class Square extends Figures {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square is drawn.");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "square, " + "its color: " + color + ", with side: " + side + " units";
    }
}