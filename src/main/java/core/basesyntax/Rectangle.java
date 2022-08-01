package core.basesyntax;

public class Rectangle extends Figures {
    private final int width;
    private final int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle is drawn.");
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "rectangle, " + "its color: " + color
                + ", with sides: " + width + " units, " + height + " units";
    }
}
