import java.util.Arrays;
import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        // if
        if (name.isBlank()) {
            System.out.println("You did not enter your name.");
        }

        // if - else
        if (name.length() < 6) {
            System.out.println("Your name is too short.");
        } else {
            System.out.println("Your name is valid.");
        }

        // if - else if - else
        if (name.isBlank()){
            System.out.println("You did not enter your name.");
        } else if (name.length() < 6) {
            System.out.println("Your name is too short.");
        } else {
            System.out.println("Your name is valid.");
        }

        // dạng bài
        /*
        1. tìm và in ra các số nguyên tố tư 1 đến 100 - if
        2. nhập vào 1 số nguyên, thoả mãn các điều kiện:
            - số nguyên dương
            - số chẵn
            - lớn hơn 100
            nếu không thoả mãn điều kiện nào thì in ra lỗi tương ứng - 3 if
        3. Phân loại học lực dựa vào điểm trung bình
            - điểm < 5: Yếu
            - 5 <= điểm < 7: Trung bình
            - 7 <= điểm < 8: Khá
            - 8 <= điểm < 9: Giỏi
            - điểm >= 9: Xuất sắc
            if else if else
        4. kiểm tra năm nhuận
            - năm nhuận nếu chia hết cho 4 nhưng không chia hết cho 100
            - hoặc năm nhuận nếu chia hết cho 400
        * */

        /*
        câu lệnh điều kiện
        tính chỉ số BMI của cơ thể:
        BMI = weigh / height^2
        bmi < 18.5 - Nguyễn Huy Hoàn
        bmi > 18.5 đến < 22.5 - bình thường
        bmi > 22.5 - chà bông
        * */
        System.out.println("Enter your weight (kg): ");
        double weight = input.nextDouble();
        System.out.println("Enter your height (m): ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Nguyễn Huy Hoàn");
        } else if (bmi >= 18.5 && bmi < 22.5) {
            System.out.println("Bình thường");
        } else {
            System.out.println("Chà Bông");
        }

        // switch case
        int day = 1;
        switch (day) {
            case 1:
                int a = 10;
                System.out.println("Monday");
                break;
            case 2:
                a = 20;
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }
    }
}
