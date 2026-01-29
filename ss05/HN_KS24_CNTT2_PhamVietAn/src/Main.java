import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static final int MAX = 100;
    static String[] mssvList = new String[MAX];
    static int size = 0;

    static Scanner sc = new Scanner(System.in);
    static final String REGEX = "^B\\d{7}$";

    static void showMenu() {
        System.out.println("""
                \n+---------- MENU ----------+
                | 1. Hiển thị danh sách    |
                | 2. Thêm Mã số sinh viên  |
                | 3. Cập nhật sinh viên    |
                | 4. Xóa sinh viên         |
                | 5. Tìm kiếm sinh viên    |
                | 0. Thoát                 |
                +--------------------------+
                """);
    }

    static boolean isValidMSSV(String mssv) {
        return Pattern.matches(REGEX, mssv);
    }

    static void displaySV() {
        if (size == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        System.out.println("Danh sách MSSV:");
        for (int i = 0; i < size; i++) {
            System.out.printf("%d. %s\n", i + 1, mssvList[i]);
        }
    }

    static void addSV() {
        if (size == MAX) {
            System.out.println("Mảng đã đầy, không thể thêm!");
            return;
        }

        String mssv;
        do {
            System.out.print("Nhập MSSV mới: ");
            mssv = sc.nextLine();
            if (!isValidMSSV(mssv)) {
                System.out.println("Sai định dạng! MSSV phải dạng Bxxxxxxx (7 chữ số sau B)");
            }
        } while (!isValidMSSV(mssv));

        mssvList[size++] = mssv;
        System.out.println("Thêm thành công!");
    }

    static void updateSV() {
        if (size == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        int index;
        do {
            System.out.printf("Nhap vị trí cần sửa (1 - %d): ", size);
            index = Integer.parseInt(sc.nextLine()) - 1;
            if (index < 0 || index >= size) {
                System.out.println("Vị trí không hợp lệ! Vui lòng nhập lại");
            }
        } while (index < 0 || index >= size);

        String newMssv;
        do {
            System.out.print("Nhập MSSV mới: ");
            newMssv = sc.nextLine();
            if (!isValidMSSV(newMssv)) {
                System.out.println("Sai định dạng! Vui lòng nhập lại");
            }
        } while (!isValidMSSV(newMssv));

        mssvList[index] = newMssv;
        System.out.println("Cập nhật thành công!");
    }

    static void deleteSV() {
        if (size == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        System.out.print("Nhập MSSV cần xóa: ");
        String target = sc.nextLine();

        int pos = -1;
        for (int i = 0; i < size; i++) {
            if (mssvList[i].equalsIgnoreCase(target)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Không tìm thấy MSSV!");
            return;
        }

        for (int i = pos; i < size - 1; i++) {
            mssvList[i] = mssvList[i + 1];
        }

        mssvList[--size] = null;
        System.out.println("Xóa thành công!");
    }

    static void searchSV() {
        if (size == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        System.out.print("Nhập chuỗi cần tìm: ");
        String key = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (mssvList[i].toLowerCase().contains(key)) {
                System.out.println((i + 1) + ". " + mssvList[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy MSSV phù hợp!");
        }
    }

    public static void main(String[] args) {

        int choice;
        do {
            showMenu();
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    displaySV();
                    break;
                case 2:
                    addSV();
                    break;
                case 3:
                    updateSV();
                    break;
                case 4:
                    deleteSV();
                    break;
                case 5:
                    searchSV();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

    }
}


