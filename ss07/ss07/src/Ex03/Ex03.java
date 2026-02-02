package Ex03;

public class Ex03 {
    public static void main(String[] args) {
        double[] scores = {6.5, 8.0, 4.5, 7.0, 5.5};

        System.out.print("Danh sách điểm: ");
        for (double s : scores) {
            System.out.printf("%.1f, ", s);
        }

        System.out.println("\n>> Kết quả xử lý:");
        double avg = ScoreUtils.calculateAverage(scores);
        System.out.printf("- Điểm trung bình cả lớp: %.2f\n", avg);

        for (double s : scores) {
            if (ScoreUtils.checkPass(s)) {
                System.out.println("- Điểm " + s + ": Đạt");
            } else {
                System.out.println("- Điểm " + s + ": Trượt");
            }
        }
    }
}
class ScoreUtils {
    // Kiểm tra Đạt / Trượt
    public static boolean checkPass(double score) {
        return score >= 5.0;
    }
    // Tính điểm trung bình
    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double s : scores) {
            sum += s;
        }
        return sum / scores.length;
    }
}
