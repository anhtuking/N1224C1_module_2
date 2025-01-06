package set_map.exercise1;

import java.util.HashSet;

public class Set2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {0, 2, 4, 6, 8};

        // tao bien luu tru 2 mang
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // them phan tu vao mang 1
        for (int num : arr) {
            set.add(num);
        }

        // them phan tu vao mang 2
        for (int num : arr2) {
            set2.add(num);
        }

        // tao bien luu tru 2 mang chung
        HashSet<Integer> set3 = new HashSet<>(set);
        set3.retainAll(set2);

        System.out.println("Cac phan tu chung cua 2 mang la: ");
        for (int result : set3) {
            System.out.println(result);
        }
    }
}
