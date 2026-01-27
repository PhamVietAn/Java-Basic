import java.util.Scanner;

public class Btth {
    static final int MAX = 100;
    static int[] ids = new int[MAX];
    static String[] titles = new String[MAX];
    static int[] quantities = new int[MAX];
    static int size = 0;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    showList();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    updateQuantity();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    searchBook();
                    break;
                case 6:
                    sortByQuantityDesc();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        } while (choice != 0);
    }

    static void showMenu() {
        System.out.println("""
                \n+========== QUẢN LÝ THƯ VIỆN =============+
                |   1. Xem danh sách                      |
                |   2. Thêm sách mới                      |
                |   3. Cập nhật số lượng                  |
                |   4. Xóa sách                           |
                |   5. Tìm kiếm                           |
                |   6. Sắp xếp theo số lượng giảm dần     |
                |   0. Thoát                              |
                +=========================================+
                """);
        System.out.print("Chọn: ");
    }

    static void showList() {
        if (size == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        System.out.printf("%-10s %-25s %-10s\n", "Mã", "Tên sách", "Số lượng");
        for (int i = 0; i < size; i++) {
            System.out.printf("%-10d %-25s %-10d\n", ids[i], titles[i], quantities[i]);
        }
    }

    static void addBook() {
        if (size == MAX) {
            System.out.println("Mảng đầy, không thể thêm!");
            return;
        }

        System.out.print("Nhập mã sách: ");
        int id = Integer.parseInt(sc.nextLine());

        if (findIndexById(id) != -1) {
            System.out.println("Mã sách đã tồn tại!");
            return;
        }

        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();

        System.out.print("Nhập số lượng: ");
        int qty = Integer.parseInt(sc.nextLine());

        ids[size] = id;
        titles[size] = title;
        quantities[size] = qty;
        size++;

        System.out.println("Thêm sách thành công!");
    }

    static void updateQuantity() {
        System.out.print("Nhập mã sách: ");
        int id = Integer.parseInt(sc.nextLine());

        int index = findIndexById(id);
        if (index == -1) {
            System.out.println("Không tìm thấy sách!");
            return;
        }

        System.out.print("Nhập số lượng mới: ");
        quantities[index] = Integer.parseInt(sc.nextLine());

        System.out.println("Cập nhật thành công!");
    }

    static void deleteBook() {
        System.out.print("Nhập mã sách cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());

        int index = findIndexById(id);
        if (index == -1) {
            System.out.println("Không tìm thấy sách!");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            ids[i] = ids[i + 1];
            titles[i] = titles[i + 1];
            quantities[i] = quantities[i + 1];
        }
        size--;

        System.out.println("Xóa thành công!");
    }

    static void searchBook() {
        System.out.print("Nhập từ khóa: ");
        String key = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (titles[i].toLowerCase().contains(key)) {
                System.out.printf("%-10d %-25s %-10d\n", ids[i], titles[i], quantities[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy kết quả!");
        }
    }

    static void sortByQuantityDesc() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (quantities[i] < quantities[j]) {
                    swap(i, j);
                }
            }
        }
        System.out.println("Sắp xếp xong!");
    }

    static void swap(int i, int j) {
        int tempId = ids[i];
        ids[i] = ids[j];
        ids[j] = tempId;

        String tempTitle = titles[i];
        titles[i] = titles[j];
        titles[j] = tempTitle;

        int tempQty = quantities[i];
        quantities[i] = quantities[j];
        quantities[j] = tempQty;
    }

    static int findIndexById(int id) {
        for (int i = 0; i < size; i++) {
            if (ids[i] == id) return i;
        }
        return -1;
    }
}
