import java.util.Scanner;

public class Ex01 {
    public static int[] addBookToLibraries(int n) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[n];

        System.out.printf("Nhập mã số cho %d cuốn sách:", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("Sách thứ %d: ",i + 1);
            arr[i] = input.nextInt();
        }
        return arr;
    }

    // Hiển thị danh sách mã sách
    public static void displayLibraries(int[] arr) {
        System.out.print("Danh sách mã sách: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số lượng sách cần quản lý: ");
        int n = input.nextInt();

        int[] books = addBookToLibraries(n);

        System.out.println("\n--- KẾT QUẢ ---");
        displayLibraries(books);
    }
}
