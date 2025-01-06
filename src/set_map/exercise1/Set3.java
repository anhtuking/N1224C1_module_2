package set_map.exercise1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                sum += num;
            }
        }

        System.out.println("Tong cac phan tu la: " + sum);

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num2 : arr) {
            treeSet.add(num2);
        }
        int min = treeSet.first();
        int max = treeSet.last();

        System.out.println("Phan tu lon nhat trong mang la :" + max);
        System.out.println("Phan tu nho nhat trong mang la :" + min);
    }
}
