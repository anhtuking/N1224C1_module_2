package list.exercise1;

public class MyArrayList {
    private int capacity;

    private int[] arr;

    private int size;

    private int size() {
        return size;
    }

    private int[] emptyArray = {};

    public MyArrayList() {
        arr = emptyArray;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    // a. thêm phần tử element vào cuối
    public void add(int element) {
        if (arr == emptyArray) {
            this.capacity = 10;
            this.arr = emptyArray;
        }

        if (size == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) {
                capacity++;
            }

            int[] arr2 = new int[this.capacity];

            // copy phan tu
            for (int i = 0; i < size; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[size] = element;
        size++;
    }
    //b. trả về thông tin đối tượng

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }

    // c. add phần tử vào vi tri index
    public void add(int index, int element) {
        if (index < 0 || index > size) {
            System.out.println("Khong hop le !!");
            return;
        }
        if (size == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) {
                capacity++;
            }
            int[] arr2 = new int[capacity];

            for (int i = 0; i < size; i++) {
                arr2[i] = arr[i];
            }
            arr2[index] = element;

            for (int i = index; i < size; i++) {
                arr2[i + 1] = arr[i];
            }
            arr = arr2;
        } else {
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = element;
        }
        size++;
    }

    // d. thay thế phần tử tại vị trí index
    public void thayThe(int index, int element) {
        if (index < 0 || index > size) {
            System.out.println("Khong hop le !!");
            return;
        }
        arr[index] = element;
    }

    // e. trả về phần tử tại vị trí index
    public Integer traPhanTu(int index) {
        if (index < 0 || index > size) {
            System.out.println("Khong hop le !!");
            return null;
        }
        return arr[index];
    }

    // f. lấy vị trí index phần tử đầu tiên tìm thấy
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // g. lấy vị trí index phần tử cuối cùng tìm thấy
    public int lastIndexOf(int element) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // h. xóa phần tử tại vị trí index
    public void remove(int index) {
        if (index < 0 || index > size) {
            System.out.println("Khong hop le !!");
            return;
        }
        // dịch chuyển phần tử tù index trở về sang trái để xoá phần tử tại index.
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    // i. xóa tất cả phần tử element
    public void removeElement(int element) {
        int newIndex = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != element) {
                arr[newIndex] = arr[i];
                newIndex++;
            }
        }
        size = newIndex;
    }
}
