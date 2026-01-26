import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập mã khu vực (A, B, C, D): ");
        String areaCode = input.nextLine().toUpperCase();
        switch (areaCode) {
            case "A":
                System.out.println("Tầng 1: Sách Văn học");
                break;
            case "B":
                System.out.println("Tầng 2: Sách Khoa học");
                break;
            case "C":
                System.out.println("Tầng 3: Sách Ngoại ngữ");
                break;
            case "D":
                System.out.println("Tầng 4: Sách Tin học");
                break;
            default:
                System.out.println("Mã khu vực không hợp lệ");
                break;
        }
    }
}
