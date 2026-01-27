import java.util.Scanner;

public class Ex02 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().equals(search.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] books = {"Doraemon", "Conan", "Harry Potter", "Sherlock Holmes", "Clean Code"};

        System.out.print("Nhập tên sách cần tìm: ");
        String search = input.nextLine().toLowerCase();

        int pos = searchBooks(books, search);

        if (pos != -1) {
            System.out.printf("\nTìm thấy sách '%s' tại vị trí số: %d", search , pos);
        } else {
            System.out.println("Sách không tồn tại trong thư viện.");
        }
    }
}
