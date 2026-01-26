import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id;

        do {
            System.out.print("Nhập mã ID sách mới (phải > 0): ");
            id = input.nextInt();

            if (id <= 0) {
                System.out.println("Lỗi: ID phải là số dương. Mời nhập lại!");
            }

        } while (id <= 0);

        System.out.printf("Xác nhận: Mã sách %d đã được ghi nhận.", id);
    }
}
