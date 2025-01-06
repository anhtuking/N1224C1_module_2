package list;

import java.util.Arrays;

public class MyArrayList {
    private int capacity;
    int[] arr;
    private int size;

    private int[] emptyArray = {};

    public int size() {
        return size;
    }

    public MyArrayList() {
        arr = emptyArray;
        this.arr = new int[this.capacity];
    }

    public void add(int element) {
        // kiểm tra nếu rỗng thì tạo ra 10 phần tử
        if (arr == emptyArray) {
            this.capacity = 10;
            this.arr = new int[this.capacity];
        }

        if (size == capacity) {
            this.capacity *= 1.5; // tăng lên 50% kích thước
            if (size == capacity) { // tránh trường hợp capacity = 0 hoặc 1
                capacity++;
            }

            // tạo ra một mảng có kích thước là capacity
            int[] brr = new int[this.capacity];

            // copy phần tử
            for (int i = 0; i < size; i++) {
                brr[i] = arr[i];
            }

            // cho a tham chiếu đến vùng nhớ mới
            arr = brr;
        }
        arr[size] = element;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(arr[i]).append("\t");
        }
        return Arrays.toString(arr) ;
    }
}
