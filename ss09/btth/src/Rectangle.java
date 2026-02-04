public class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calculate();
    }

    @Override
    public void calculate() {
        perimeter = 2 * (length + width);
        area = length * width;
    }
}
