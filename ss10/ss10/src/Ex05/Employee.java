package Ex05;

public abstract class Employee {

    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void printSalary() {
        System.out.println("Tên: " + name);
        System.out.println("Lương cơ bản: " + baseSalary);
        System.out.println("Tổng lương: " + calculateSalary());
        System.out.println("----------------------------");
    }
}
