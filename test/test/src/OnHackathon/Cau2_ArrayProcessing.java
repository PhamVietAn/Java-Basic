package OnHackathon;

public class Cau2_ArrayProcessing {


    // Phần 1: Xóa phần tử x và dồn mảng sang trái
    public static int deleteAndShift(int[] arr, int n, int x) {

        int k = 0; // vị trí ghi đè phần tử hợp lệ

        // Duyệt toàn bộ mảng
        for (int i = 0; i < n; i++) {

            // Nếu phần tử khác x → giữ lại
            if (arr[i] != x) {
                arr[k++] = arr[i]; // ghi đè lên vị trí k
            }
        }

        // Trả về kích thước mới sau khi xóa
        return k;
    }

    // Phần 2: Đưa số chẵn về đầu, số lẻ về cuối
    public static void evenOddPartition(int[] arr, int n) {

        int left = 0;       // con trỏ đầu mảng
        int right = n - 1;  // con trỏ cuối mảng

        // Khi left chưa vượt right
        while (left < right) {

            // Nếu bên trái là số chẵn → bỏ qua
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            // Nếu bên phải là số lẻ → bỏ qua
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            // Hoán đổi nếu tìm được cặp sai vị trí
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }
}
