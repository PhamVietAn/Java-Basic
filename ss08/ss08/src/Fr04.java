import java.util.Scanner;

public class Fr04 {
    private Student[] students;
    private int size;
    private Scanner sc = new Scanner(System.in);

    public Fr04(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    // ===== FR4: CẬP NHẬT SINH VIÊN =====
    public void updateStudent() {
        System.out.print("Nhập mã sinh viên cần cập nhật: ");
        String id = sc.nextLine();

        for (int i = 0; i < size; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {

                System.out.print("Nhập tên mới: ");
                String name = sc.nextLine();

                System.out.print("Nhập tuổi mới (18-30): ");
                int age = Integer.parseInt(sc.nextLine());

                System.out.print("Nhập điểm Toán: ");
                double math = Double.parseDouble(sc.nextLine());

                System.out.print("Nhập điểm Lý: ");
                double physics = Double.parseDouble(sc.nextLine());

                System.out.print("Nhập điểm Hóa: ");
                double chemistry = Double.parseDouble(sc.nextLine());

                // Cập nhật
                students[i].setName(name);
                students[i].setAge(age);
                students[i].setMath(math);
                students[i].setPhysics(physics);
                students[i].setChemistry(chemistry);

                // Tính lại điểm & xếp loại
                students[i].calculateAverageAndRank();

                System.out.println("✅ Cập nhật sinh viên thành công!");
                return;
            }
        }

        System.out.println("❌ Không tìm thấy sinh viên với mã: " + id);
    }
}

class Student {
    private String id;
    private String name;
    private int age;
    private String gender;
    private double math, physics, chemistry;
    private double average;
    private String rank;

    // Getter
    public String getId() {
        return id;
    }

    // Setter (KHÔNG có setId)
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setMath(double math) { this.math = math; }
    public void setPhysics(double physics) { this.physics = physics; }
    public void setChemistry(double chemistry) { this.chemistry = chemistry; }

    public void calculateAverageAndRank() {
        average = (math + physics + chemistry) / 3;

        if (average >= 8 && math >= 6.5 && physics >= 6.5 && chemistry >= 6.5)
            rank = "Giỏi";
        else if (average >= 6.5 && math >= 5 && physics >= 5 && chemistry >= 5)
            rank = "Khá";
        else if (average >= 5 && math >= 3.5 && physics >= 3.5 && chemistry >= 3.5)
            rank = "Trung bình";
        else
            rank = "Yếu";
    }
}
