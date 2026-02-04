package Ex01;

public class Student extends Person {
    private String studentId;
    private double gpa;

    public Student(String fullName, int age, String studentId, double gpa) {
        super(fullName, age); // dùng constructor lớp cha
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // tái sử dụng code của Person
        System.out.println("Mã SV: " + studentId);
        System.out.println("Điểm TB: " + gpa);
    }
}

