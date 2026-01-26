import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int diemUyTin = 100, soNgayTre;

        System.out.println("--- HỆ THỐNG ĐÁNH GIÁ ĐỘC GIẢ ---");
        System.out.println("(Nhập số ngày trễ. Nhập 999 để kết thúc)");

        while (true) {
            System.out.print("\nSố ngày trễ của lần này: ");
            soNgayTre = input.nextInt();

            if (soNgayTre == 999) {
                break;
            }

            if (soNgayTre <= 0) {
                diemUyTin += 5;
                System.out.printf("-> Trả đúng hạn: +5 điểm.%n");
            } else {
                int truDiem = soNgayTre * 2;
                diemUyTin -= truDiem;
                System.out.printf("-> Trả trễ %d ngày: -%d điểm.%n", soNgayTre, truDiem);
            }
        }

        System.out.printf("%nTổng điểm uy tín: %d%n", diemUyTin);

        if (diemUyTin > 120) {
            System.out.printf("Xếp loại: ĐỘC GIẢ THÂN THIẾT%n");
        } else if (diemUyTin >= 80) {
            System.out.printf("Xếp loại: ĐỘC GIẢ TIÊU CHUẨN%n");
        } else {
            System.out.printf("Xếp loại: ĐỘC GIẢ CẦN LƯU Ý%n");
        }
    }
}
