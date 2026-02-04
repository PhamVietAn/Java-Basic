package Ex05;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new OfficeEmployee("Nguyễn Văn A", 8000000, 2000000),
                new ProductionEmployee("Trần Thị B", 500, 30000),
                new OfficeEmployee("Lê Văn C", 9000000, 1500000)
        };

        double totalSalary = 0;

        for (Employee e : employees) {
            double salary = e.calculateSalary(); // đa hình runtime
            totalSalary += salary;
            System.out.println("Lương: " + salary);
        }

        System.out.println("Tổng lương: " + totalSalary);
    }
}

