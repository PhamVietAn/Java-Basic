package Ex05;

public class ProductionEmployee extends Employee {
    private int productCount;
    private double salaryPerProduct;

    public ProductionEmployee(String name, int productCount, double salaryPerProduct) {
        super(name);
        this.productCount = productCount;
        this.salaryPerProduct = salaryPerProduct;
    }

    @Override
    public double calculateSalary() {
        return productCount * salaryPerProduct;
    }
}

