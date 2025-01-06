package list.exercise2;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        // add first
        myLinkedList.addLast(10);
        myLinkedList.addLast(20);
        myLinkedList.addLast(30);
        myLinkedList.addLast(40);

        // tra ve thong tin doi tuong
        System.out.println("danh sach ban dau " + myLinkedList.toString());

        // add last
        myLinkedList.addLast(50);

        // add index, element
        myLinkedList.add(2,35);
        System.out.println("Danh sach sau khi them 35 vao vi tri 2:" + myLinkedList.toString());

        // remove first
        myLinkedList.removeFirst();
        System.out.println("Danh sacsh sau khi xoa phan tu dau tien" + myLinkedList.toString());

        // remove last
        myLinkedList.removeLast();
        System.out.println("Danh sach sau khi xoa phan tu cuoi: " + myLinkedList.toString());

        // remove
        myLinkedList.remove(3);
        System.out.println("Danh sach sau khi xoa phan tu tai vi tri thu 3: "  + myLinkedList.toString());

        // get first
        Integer firstElement = myLinkedList.getFirst();
        System.out.println("Phan tu dau tien trong danh sach : " + firstElement);

        // get last
        Integer lastElement = myLinkedList.getLast();
        System.out.println("Phan tu cuoi cung trong danh sach : " + lastElement);

        // lay phan tu tai vi tri index
        Integer elementIndex = myLinkedList.get(2);
        System.out.println("phan tu tai vi tri 2 trong danh sach : " + elementIndex);

        // set index, element
        myLinkedList.set(0,25);
        System.out.println("danh sach sau khi thay the phan tu tai vi tri 0 thanh 25: " + myLinkedList.toString());

        // index of
        Integer indexOfElement = myLinkedList.indexOf(25);
        System.out.println("Vi tri index tai phan tu 25 la: " + indexOfElement);

        // last indexof
        Integer lastIndexOfElement = myLinkedList.lastIndexOf(25);
        System.out.println("vi tri index cuoi cung tai phan tu 25 la: " + lastIndexOfElement);
    }
}
