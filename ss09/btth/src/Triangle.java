public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        calculate();
    }

    @Override
    public void calculate() {
        perimeter = a + b + c;
        double p = perimeter / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
