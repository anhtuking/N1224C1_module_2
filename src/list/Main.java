package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);

        System.out.println(myArrayList);
    }
}
