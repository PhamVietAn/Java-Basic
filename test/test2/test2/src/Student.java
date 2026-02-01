import java.util.Date;

public class Student {
    String StudentID;
    String fullName;
    Date dateOfBirth;
    String email;
    String phoneNumber;

    void checkIn() {
        System.out.println(fullName + " đã điểm danh.");
    }
    void doHomework() {
        System.out.println(fullName + " đang làm bài tập.");
    }

    public Student(String studentID, String fullName, Date dateOfBirth, String email, String phoneNumber) {
        StudentID = studentID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
