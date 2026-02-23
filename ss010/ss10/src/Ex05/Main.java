package Ex05;

public class Main {

    public static void main(String[] args) {

        Employee staff = new OfficeStaff("An", 8000);
        Employee manager = new Manager("Bình", 15000, 5000);

        staff.printSalary();
        manager.printSalary();
    }
}
