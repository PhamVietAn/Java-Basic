import java.util.*;

public class Main {
    public static void main(String[] args) {

        ProductRepository repo = new ProductRepository();

        repo.add(new ElectronicProduct("E01", "Laptop", 20000000, 24));
        repo.add(new ElectronicProduct("E02", "Tai nghe", 2000000, 6));
        repo.add(new FoodProduct("F01", "Bánh", 50000, 10));
        repo.add(new FoodProduct("F02", "Sữa", 30000, 5));

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("""
                    ==================== MENU ====================
                    1. Hiển thị tất cả sản phẩm
                    2. Tìm kiếm sản phẩm theo ID
                    3. Sắp xếp danh sách theo giá tăng dần
                    4. Thống kê số lượng sản phẩm theo từng loại
                    5. Thoát
                    ==============================================
                    """);
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("========== DANH SÁCH SẢN PHẨM ==========");
                    for (Product p : repo.findAll()) {
                        if (p != null) {
                            p.displayInfo();
                            System.out.println("Thành tiền: " + p.calculateFinalPrice());
                            System.out.println("----------------------");
                        }
                    }
                    break;
                case 2:
                    System.out.println("========== TÌM SẢN PHẨM ==========");
                    System.out.print("Nhập ID sản phẩm cần tìm: ");
                    String id = sc.nextLine();
                    Product found = repo.findById(id);
                    if (found != null) {
                        found.displayInfo();
                        System.out.println("Thành tiền: " + found.calculateFinalPrice());
                    } else {
                        System.out.println("Không tìm thấy!");
                    }
                    break;
                case 3:
                    System.out.println("======== SẮP XẾP THEO GIÁ ========");
                    List<Product> sortedList = new ArrayList<>(repo.findAll());
                    Collections.sort(sortedList, Comparator.comparingDouble(Product::getPrice));
                    for (Product p : sortedList) {
                        System.out.println(p.getId() + " - Giá: " + p.getPrice());
                    }
                    System.out.println("===============================");
                    break;
                case 4:
                    System.out.println("=========== THỐNG KÊ ===========");
                    Map<String, Integer> stats = repo.countByType();
                    System.out.println("Số lượng sản phẩm theo loại:");
                    for (Map.Entry<String, Integer> entry : stats.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    System.out.println("===============================");
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 5);
    }
}