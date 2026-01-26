import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, total = 0 ;
        do {
            System.out.print("Nhập số lượng sách trả muộn: ");
            n = input.nextInt();
            if (n < 0) {
                System.out.println("Số lượng sách trả muộn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (n < 0);
        int daysLate;
        for (int i = 0; i < n; i++) {
            do {
                System.out.printf("Nhâp số ngày trả muộn của cuốn sách thứ %d: ", i + 1);
                daysLate = input.nextInt();
            } while (daysLate < 0);
            total += (daysLate*5000);
        }
        System.out.printf("Tổng số tiền phạt là: %d VND%n", total);
    }
}
