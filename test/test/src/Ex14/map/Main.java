package Ex14.map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(1000));
        }
        System.out.println(list);

        // loại bỏ trùng lặp
        Set<Integer> set = new HashSet<>();
        System.out.println(list.size());
        System.out.println(set);
        System.out.println(set.size());

        // đếm số phần tử
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : list) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.printf("Phần tử %d xuất hiện %d lần\n", entry.getKey(), entry.getValue());
        }
    }
}
