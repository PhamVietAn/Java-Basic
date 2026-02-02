package Ex04;

public class Ex04 {
    public static void main(String[] args) {

        ClassRoom s1 = new ClassRoom("Nguyễn Văn A");
        ClassRoom s2 = new ClassRoom("Trần Thị B");
        ClassRoom s3 = new ClassRoom("Lê Văn C");

        s1.payFund(100_000);
        s2.payFund(200_000);
        s3.payFund(150_000);

        System.out.println();
        ClassRoom.showClassFund();
    }
}

class ClassRoom {
    static double classFund = 0;

    private String studentName;

    // Constructor
    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    // Sinh viên đóng tiền vào quỹ lớp
    public void payFund(double amount) {
        System.out.println(studentName + " đóng " + amount + " vào quỹ lớp");
        classFund += amount;
    }

    // Xem tổng quỹ lớp
    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund);
    }
}

