package Ex03;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary); // PHẢI là dòng đầu tiên
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // gọi lại phương thức lớp cha
        System.out.println("Phòng ban: " + department);
    }
}

