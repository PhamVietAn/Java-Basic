package OnHackathon;

public class Cau1_StringProcessing {

    // Phần 1: Tách nguyên âm và phụ âm
    public static void tachKyTu(String input) {

        String nguyenAm = "";  // Chuỗi chứa nguyên âm
        String phuAm = "";     // Chuỗi chứa phụ âm

        // Duyệt từng ký tự trong chuỗi
        for (int i = 0; i < input.length(); i++) {

            // Chuyển ký tự về chữ thường để so sánh
            char c = Character.toLowerCase(input.charAt(i));

            // Kiểm tra có phải chữ cái không
            if (Character.isLetter(c)) {

                // Nếu là nguyên âm
                if (c == 'u' || c == 'e' || c == 'o' || c == 'a' || c == 'i') {
                    nguyenAm += c; // thêm vào chuỗi nguyên âm
                } else {
                    phuAm += c;    // thêm vào chuỗi phụ âm
                }
            }
        }
        System.out.println("Nguyên âm: " + nguyenAm);
        System.out.println("Phụ âm: " + phuAm);
    }


    // Phần 2: Tìm ký tự xuất hiện nhiều nhất
    public static void kyTuNhieuNhat(String input) {

        input = input.toLowerCase(); // chuẩn hóa chữ thường

        int max = 0;      // lưu số lần xuất hiện lớn nhất
        char result = ' '; // lưu ký tự có số lần lớn nhất

        // Duyệt từng ký tự
        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            if (c == ' ') continue; // bỏ qua khoảng trắng

            int count = 0; // đếm số lần xuất hiện của c

            // Đếm số lần xuất hiện của c trong chuỗi
            for (int j = 0; j < input.length(); j++) {
                if (c == input.charAt(j)) {
                    count++;
                }
            }

            // Nếu số lần lớn hơn max hiện tại → cập nhật
            if (count > max) {
                max = count;
                result = c;
            }
        }

        System.out.println(result + " (xuất hiện " + max + " lần)");
    }
}