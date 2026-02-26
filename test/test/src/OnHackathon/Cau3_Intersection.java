package OnHackathon;

public class Cau3_Intersection {

    // Hàm kiểm tra value đã tồn tại trong mảng arr chưa
    public static boolean isExist(int[] arr, int size, int value) {

        // Duyệt các phần tử đã lưu
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) return true;
        }

        return false;
    }


    // Hàm tìm giao của hai mảng
    public static void intersection(int[] A, int n, int[] B, int m) {

        int[] result = new int[n]; // mảng lưu kết quả
        int k = 0; // số phần tử giao tìm được

        // Duyệt từng phần tử của A
        for (int i = 0; i < n; i++) {

            // So sánh với từng phần tử của B
            for (int j = 0; j < m; j++) {

                if (A[i] == B[j]) {

                    // Nếu chưa tồn tại trong result → thêm vào
                    if (!isExist(result, k, A[i])) {
                        result[k++] = A[i];
                    }
                }
            }
        }

        // In kết quả
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
    }

}