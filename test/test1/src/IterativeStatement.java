import java.math.BigInteger;
import java.util.Scanner;

public class IterativeStatement {
    public static void main(String[] args) {
        // for
//        for (int i = 10, j = 100 ; i < 100 ; i += 10, j -= 10) {
//            System.out.println("i = " + i + ", j = " + j);
//        }
//
//        // while - do while
//        boolean isCheck = true;
//        while (isCheck) {
//            System.out.println("Inside while loop");
//            isCheck = false;
//        }
//
//        do {
//            System.out.println("Inside do while loop");
//        } while (isCheck);
//
        /*
        *   Vòng lặp
        * 1. viết thuật toán kiểu tra số nguyên nhập vào và in ra thông báo kết luận số nhập vào vó phải số nguyên tố hay không
        * 2. tìm và in ra 100 số nguyên tố đầu tiên
        * 3. viết chương trình thực hiện menu chức năng sau:
        * +-------------------------Menu-------------------------+
        * | 1. Nhập vào 1 số nguyên dương n                     |
        * | 2. tính tổng của số chẵn và tổng của số lẻ < n      |
        * | 3. Tìm các số hoàn hảo < n                          |
        * | 4. tính n!                                          |
        * | 5. thoát                                            |
        * +------------------------------------------------------+
        * */

//        // 1. viết thuật toán kiểu tra số nguyên nhập vào và in ra thông báo kết luận số nhập vào vó phải số nguyên tố hay không
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập vào 1 số nguyên tố: ");
//        int n = input.nextInt();
//        boolean isPrime = true;
//        if (n < 2) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if (n % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        if (isPrime) {
//            System.out.printf("%d Là số số nguyên tố\n", n);
//        } else {
//            System.out.printf("%d Không phải số nguyên tố\n", n);
//        }
//
//        // 2. tìm và in ra 100 số nguyên tố đầu tiên
//        System.out.println("100 số nguyên tố đầu tiên là: ");
//        int count = 0;
//        for (int number = 2; count < 100; number++) {
//            boolean isPrimeNumber = true;
//            for (int i = 2; i <= Math.sqrt(number); i++) {
//                if (number % i == 0) {
//                    isPrimeNumber = false;
//                    break;
//                }
//            }
//            if (isPrimeNumber) {
//                if (count < 99) {
//                    System.out.printf("%d ", number);
//                }
//                count++;
//            }
//        }

        // 3. viết chương trình thực hiện menu chức năng sau:
        Scanner input = new Scanner(System.in);
        int choice, n = 0;
        do {
            System.out.printf("""
                    \n        +-------------------------Menu-------------------------+
                            | 1. Nhập vào 1 số nguyên dương n                      |
                            | 2. tính tổng của số chẵn và tổng của số lẻ < n       |
                            | 3. Tìm các số hoàn hảo < n                           |
                            | 4. tính n!                                           |
                            | 5. thoát                                             |
                            +------------------------------------------------------+
                    """);
            System.out.println("Mời bạn chọn chức năng: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập vào 1 số nguyên dương n: ");
                    n = input.nextInt();
                    if (n < 0) {
                        System.out.println("Vui lòng nhập số nguyên dương.");
                        n = 0;
                    } else {
                        System.out.printf("Bạn đã nhập số: %d\n", n);
                    }
                    break;
                case 2:
                    if (n <= 0) {
                        System.out.println("Chưa có giá trị n. Vui lòng chọn 1 để nhập n trước.");
                        break;
                    }
                    int evenSum = 0, oddSum = 0;
                    for (int i = 0; i < n; i++) {
                        if (i % 2 == 0) evenSum += i;
                        else oddSum += i;
                    }
                    System.out.printf("Tổng của số chẵn < n là: %d\n", evenSum);
                    System.out.printf("Tổng của số lẻ < n là: %d\n", oddSum);
                    break;
                case 3:
                    if (n <= 1) {
                        System.out.println("Không có số hoàn hảo < n hoặc chưa nhập n.");
                        break;
                    }
                    System.out.println("Các số hoàn hảo < n:");
                    boolean found = false;
                    for (int i = 2; i < n; i++) {
                        int sumDiv = 1;
                        int limit = (int) Math.sqrt(i);
                        for (int d = 2; d <= limit; d++) {
                            if (i % d == 0) {
                                sumDiv += d;
                                int other = i / d;
                                if (other != d) {
                                    sumDiv += other;
                                }
                            }
                        }
                        if (sumDiv == i) {
                            System.out.printf("%d ", i);
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Không tìm thấy số hoàn hảo < n.");
                    else System.out.println();
                    break;
                case 4:
                    if (n < 0) {
                        System.out.println("Không thể tính giai thừa của số âm.");
                        break;
                    }
                    BigInteger fact = BigInteger.ONE;
                    for (int i = 2; i <= n; i++) fact = fact.multiply(BigInteger.valueOf(i));
                    System.out.printf("%d! = %s\n", n, fact.toString());
                    break;

                case 5:
                    System.out.println("Bạn đã chọn thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }while (choice != 5);
        System.out.println("Chương trình kết thúc!!!");
    }
}
