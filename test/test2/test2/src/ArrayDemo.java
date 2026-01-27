import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        /*
        * Bài tập Array
        * 1.1. nhập và in bảng
        * thực hiện cho người dùng nhập vào số lượng phần tử mảng n và nhập n giá trị cho từng phần tử
        * tiến hành in ra các phần tử trong mảng vừa nhập
        *
        * 1.2. phát triển bài 1.1 thêm các yêu cầu sau:
        * - tìm và in ra các số nguyên tố trong mảng
        * - tính tổng các số fibonaci trong mảng
        * - tìm min, max trong mảng
        * - tính tổng các giai thừa của từng phần tử trong mảng
        * */

        int n;
        Scanner input = new Scanner(System.in);

        // 1.1. nhập và in bảng
        System.out.print("Nhập số lượng phần tử mảng: ");
        n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            arr[i] = input.nextInt();
        }

        System.out.print("Mảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        };

        //1.2
        // tìm và in ra các số nguyên tố trong mảng
        System.out.print("\nCác số nguyên tố: ");
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];

            if (x >= 2) {
                boolean prime = true;
                for (int j = 2; j <= Math.sqrt(x); j++) {
                    if (x % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.print(x + " ");
                    found = true;
                }
            }
        }
        if (!found) System.out.print("Không có");

        // tính tổng các số fibonaci trong mảng
        long sumFibo = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = 0, b = 1;
            while (b < arr[i]) {
                int c = a + b;
                a = b;
                b = c;
            }
            if (arr[i] == b || arr[i] == 0) {
                sumFibo += arr[i];
            }
        }
        System.out.printf("\nTổng Fibonacci = %d\n",sumFibo);

        // tìm min, max trong mảng
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

        // Tổng các giai thừa
        long sumFactorial = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 20) {
                long gt = 1;
                for (int j = 1; j <= arr[i]; j++) {
                    gt *= j;
                }
                sumFactorial += gt;
            }
        }
        System.out.printf("Tổng giai thừa = %d", sumFactorial);
    }
}
