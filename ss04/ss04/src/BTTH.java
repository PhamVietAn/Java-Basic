import java.time.Year;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BTTH {
    // regex validation
    static boolean validBookID(String id) {
        return id.matches("LIB-\\d{4}-S");
    }

    static boolean validISBN(String isbn) {
        return isbn.matches("\\d{10}");
    }

    static boolean validYear(String year) {
        if (!year.matches("\\d{4}")) return false;
        return Integer.parseInt(year) <= Year.now().getValue();
    }

    // chuẩn hoá chuỗi
    static String normalizeName(String s) {
        s = s.trim().replaceAll("\\s+", " ").toLowerCase();
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            result.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1))
                    .append(" ");
        }
        return result.toString().trim();
    }

    // tạo chuỗi trích dẫn
    static String buildCitation(String id, String title, String author, String year) {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(id).append("] - ")
                .append(title).append(" - ")
                .append(author).append(" (")
                .append(year).append(")");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách (LIB-xxxx-S): ");
        String bookID = sc.nextLine();

        System.out.print("Nhập ISBN-10: ");
        String isbn = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String rawTitle = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        String rawAuthor = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        String year = sc.nextLine();

        if (!validBookID(bookID)) {
            System.out.println("Mã sách không hợp lệ!");
            return;
        }
        if (!validISBN(isbn)) {
            System.out.println("ISBN không hợp lệ!");
            return;
        }
        if (!validYear(year)) {
            System.out.println("Năm xuất bản không hợp lệ!");
            return;
        }

        String title = normalizeName(rawTitle);
        String author = normalizeName(rawAuthor);

        String citation = buildCitation(bookID, title, author, year);

        System.out.println("----- KẾT QUẢ BIÊN MỤC -----");
        System.out.printf("Mã sách chuẩn: %s\n", bookID);
        System.out.printf("ISBN-10: %s\n", isbn);
        System.out.printf("Tên sách: %s\n", title);
        System.out.printf("Tác giả: %s\n", author);
        System.out.printf("Năm XB: %s\n", year);
        System.out.printf("Trích dẫn: %s\n", citation);
        System.out.println("----------------------------");
    }
}
