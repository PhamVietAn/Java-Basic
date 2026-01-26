import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double priceUSD = scanner.nextDouble();

        float rate = 25450.0f;

        double priceVND = priceUSD * rate;

        long roundedPrice = (long) priceVND;

        System.out.printf("Giá chính xác (số thực): %.2f\n", priceVND);
        System.out.printf("Giá làm tròn để thanh toán (long): %d", roundedPrice);
    }
}
