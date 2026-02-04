import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        Random rd = new Random();

        int rectCount = 0, triCount = 0, cirCount = 0;

        for (int i = 0; i < shapes.length; i++) {
            int type = rd.nextInt(3);

            switch (type) {
                case 0:
                    shapes[i] = new Rectangle(
                            rd.nextInt(10) + 1,
                            rd.nextInt(10) + 1
                    );
                    rectCount++;
                    break;
                case 1:
                    shapes[i] = new Triangle(3, 4, 5);
                    triCount++;
                    break;
                case 2:
                    shapes[i] = new Circle(rd.nextInt(10) + 1);
                    cirCount++;
                    break;
            }
        }

        // 1. Duyệt và in thông tin chi tiết
        System.out.println("=== DANH SÁCH HÌNH HỌC ===");
        for (Shape s : shapes) {
            s.printInfo();
        }

        // 2. Thống kê số lượng mỗi loại
        System.out.println("\n=== THỐNG KÊ ===");
        System.out.println("Rectangle: " + rectCount);
        System.out.println("Triangle : " + triCount);
        System.out.println("Circle   : " + cirCount);
    }
}

