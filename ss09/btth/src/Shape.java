public abstract class Shape {
    protected double perimeter;
    protected double area;

    public abstract void calculate();

    public void printInfo() {
        System.out.printf(
                "%s | Chu vi: %.2f | Diện tích: %.2f%n",
                this.getClass().getSimpleName(),
                perimeter,
                area
        );
    }
}
