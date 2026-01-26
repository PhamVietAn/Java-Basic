import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tuổi: ");
        int age = input.nextInt();
        System.out.println("Số sách đang dữ: ");
        int numBooks = input.nextInt();

        if (age >= 18 && numBooks < 3) {
            System.out.println("Được mượn sách");
        } else if (age < 18 && numBooks < 3) {
            System.out.println("Bạn chưa đủ tuổi");
        } else if ( age >= 18 && numBooks >= 3) {
            System.out.println("Bạn đã mượn quá số sách quy định");
        } else {
            System.out.println("Bạn chưa đủ tuổi và đã mượn quá số sách quy định");
        }
    }
}
