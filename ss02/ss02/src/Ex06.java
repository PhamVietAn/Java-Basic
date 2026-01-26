import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int luotMuon;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int tong = 0;
        int dem = 0;

        String[] ngay = {
                "Thu 2", "Thu 3", "Thu 4",
                "Thu 5", "Thu 6", "Thu 7", "Chu Nhat"
        };

        for (int i = 0; i < 7; i++) {
            System.out.printf("Nhap luot muon ngay %s: ", ngay[i]);
            luotMuon = input.nextInt();

            if (luotMuon == 0) {
                continue;
            }

            if (luotMuon > max) {
                max = luotMuon;
            }

            if (luotMuon < min) {
                min = luotMuon;
            }

            tong += luotMuon;
            dem++;
        }

        double trungBinh = (dem > 0) ? (double) tong / dem : 0;

        System.out.println("\n--- KET QUA THONG KE ---");
        System.out.printf("Luot muon cao nhat: %d%n", max);
        System.out.printf("Luot muon thap nhat: %d%n", min);
        System.out.printf("Trung binh luot muon/ngay: %.1f%n", trungBinh);
    }
}
