package Ex01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student("SV01", "Nguyễn Văn A");
        Student s2 = new Student("SV02", "Trần Thị B");
        Student s3 = new Student("SV03", "Lê Văn C");

        s1.display();
        s2.display();
        s3.display();

        System.out.println("Tổng số sinh viên: " + Student.totalStudent);
    }
}

class Student {
    static int totalStudent = 0;

    private String studentId;
    private String studentName;

    // Constructor
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++;
    }

    public void display() {
        System.out.println("Mã SV: " + studentId + " | Tên SV: " + studentName);
    }
}