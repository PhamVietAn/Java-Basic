public class Ex03 {
    public static void main(String[] args) {
        String[] names = {"Java Basic", "Python Pro", "Web Design", "Data Structure", "C Programming"};

        int[] quantities = {20, 50, 50, 5, 30};

        maxQuantityOfBooks(names, quantities);
        System.out.printf("%n--------------------%n");
        minQuantityOfBooks(names, quantities);
    }

    static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];

        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }

        System.out.printf("Sách có số lượng nhiều nhất (%d):%n", max);
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.printf("- %-20s%n", names[i]);
            }
        }
    }

    static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];

        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }

        System.out.printf("Sách có số lượng ít nhất (%d):%n", min);
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.printf("- %-20s%n", names[i]);
            }
        }
    }
}
