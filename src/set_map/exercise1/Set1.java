package set_map.exercise1;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};

        int[] uniArray = removeDuplicates(arr);

        System.out.println("Danh sach cac phan tu sau khi da xoa :");
        for (int num : uniArray) {
            System.out.println(num);
        }
    }

    //xoa cac phan tu trung lap
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : arr) {
            set.add(num);
        }
        int[] uniArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniArray[index++] = num;
            index++;
        }
        return uniArray;
    }
}
