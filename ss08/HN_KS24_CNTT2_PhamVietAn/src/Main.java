import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Student[] students = new Student[100];
    static int count = 0;

    public static void main(String[] args) {
        int choice;
        do {
            DisplayMenu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    inputStudents();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchByRank();
                    break;
                case 4:
                    sortByScoreDesc();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }

    static void DisplayMenu() {
        System.out.print("""
                \n===== QUẢN LÝ ĐIỂM SINH VIÊN =====
                1. Nhập danh sách sinh viên\s
                2. Hiển thị danh sách sinh viên\s
                3. Tìm kiếm sinh viên theo Học lực\s
                4. Sắp xếp theo học lực giảm dần
                5. Thoát\s
                ==================================
                Chọn chức năng: """);
    }

    // nhập danh sách sinh viên
    static void inputStudents() {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1));

            String id = "";
            boolean flag = false;
            while (!flag) {
                System.out.print("Nhập mã SV (SVxxx): ");
                id = sc.nextLine();
                if (id.matches("SV\\d{3}")) {
                    flag = true;
                } else {
                    System.out.println("Mã SV không hợp lệ!");
                }

            }

            System.out.print("Nhập họ tên: ");
            String name = sc.nextLine();

            System.out.print("Nhập điểm TB: ");
            double score = Double.parseDouble(sc.nextLine());

            students[count++] = new Student(id, name, score);
        }
        System.out.println("Nhập danh sách thành công!");
    }

    // hiển thị danh sách sinh viên
    static void displayStudents() {
        if (count == 0) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

    // Tìm kiếm sinh viên theo học lực
    static void searchByRank() {
        System.out.print("Nhập học lực cần tìm (Gioi/Kha/Trung Binh): ");
        String rank = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getRank().equalsIgnoreCase(rank)) {
                System.out.println(students[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên có học lực: " + rank);
        }
    }

    // Sắp xếp sinh viên theo học lực giảm dần
    static void sortByScoreDesc() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp theo học lực giảm dần!");
        System.out.println("Danh sách sau khi sắp xếp:");
        displayStudents();
    }
}
