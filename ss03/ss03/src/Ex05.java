import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101, 102, 103, 104, 105};
        int n = books.length;

        while (n > 0) {
            System.out.printf("Kho sách hiện tại (%d cuốn): ", n);
            display(books, n);

            System.out.print("Nhập mã sách cần xóa (0 để thoát): ");
            int id = sc.nextInt();

            if (id == 0) break;

            int newN = deleteBook(books, n, id);

            if (newN < n) {
                System.out.printf("Đã xóa sách mã %d%n", id);
                n = newN;
            } else {
                System.out.println("Không tìm thấy mã sách!");
            }
        }

        System.out.println("Kết thúc chương trình.");
    }

    static int deleteBook(int[] arr, int n, int bookId) {
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                index = i;
                break;
            }
        }

        if (index == -1) return n;

        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return n - 1;
    }

    static void display(int[] arr, int n) {
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
