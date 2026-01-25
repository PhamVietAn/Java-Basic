public class Ex03 {
    public static void main(String[] args) {
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        System.out.printf("Trước khi hoán đổi: Book1 = %s , Book2 = %s%n", book1, book2);

        String temp = book1;
        book1 = book2;
        book2 = temp;

        System.out.printf("Sau khi hoán đổi: Book1 = %s , Book2 = %s%n", book1, book2);

        /*
        * Giải thích:
        *
        * - Các biến book1, book2, temp được lưu trên Stack.
        * - Các chuỗi "Java Basic" và "Python Intro" được lưu trên Heap.
        *
        * Ban đầu:
        * book1 -> "Java Basic"
        * book2 -> "Python Intro"
        *
        * Khi temp = book1:
        * temp -> "Java Basic"
        *
        * Khi book1 = book2:
        * book1 -> "Python Intro"
        *
        * Khi book2 = temp:
        * book2 -> "Java Basic"
        * */
    }
}
