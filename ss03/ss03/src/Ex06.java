public class Ex06 {
    static int[] mergeBooks(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                temp[k++] = a[i++];
            } else if (a[i] > b[j]) {
                temp[k++] = b[j++];
            } else {
                temp[k++] = a[i++];
                j++;
            }
        }

        while (i < a.length) {
            temp[k++] = a[i++];
        }

        while (j < b.length) {
            temp[k++] = b[j++];
        }

        int[] result = new int[k];
        for (int x = 0; x < k; x++) {
            result[x] = temp[x];
        }

        return result;
    }

    static void display(int[] arr) {
        System.out.print("[ ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] khoCu = {1, 3, 5, 7, 9};
        int[] loMoi = {2, 3, 5, 6, 8, 9, 10};

        System.out.print("Kho cũ: ");
        display(khoCu);

        System.out.print("Lô mới: ");
        display(loMoi);

        int[] khoTong = mergeBooks(khoCu, loMoi);

        System.out.print("Kho tổng (đã gộp & lọc trùng): ");
        display(khoTong);
    }
}
