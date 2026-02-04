public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        calculate();
    }

    @Override
    public void calculate() {
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;
    }
}
