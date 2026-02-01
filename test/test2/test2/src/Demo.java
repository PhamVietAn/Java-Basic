import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        // khởi tạo đối tượng
        Student student = new Student(); // cấp phát bộ nhớ cho đối tượng Student

        // gán các thông tin của đối tượng
        student.StudentID = "S001";
        student.fullName = "Nguyen Van A";
        student.dateOfBirth = new Date();
        student.email = "a@gmail.com";
        student.phoneNumber = "0123456789";

        // gọi phương thức
        student.checkIn();
        student.doHomework();

        // Object và Instance
        Student s2 = new Student("S002", "Tran Thi B", new Date(), "b@gmail.com", "0987654321");
    }
}
