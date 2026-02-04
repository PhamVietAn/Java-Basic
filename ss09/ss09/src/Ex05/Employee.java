package Ex05;

public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    // Phương thức đa hình
    public abstract double calculateSalary();
}

