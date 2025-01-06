package generic_stack_queue.exercise2;

public class MyQueue<E> {
    private class Node {
        private E value;
        private Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    private int size;

    //A. add
    public void add(E value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    //b lay ra
    public E peek() {
        if (head == null) {
            System.out.println("rong, khong the lay");
            return null;
        }
        return tail.value;
    }

    //c lay ra xem va xoa
    public E poll() {
        if (head == null) {
            System.out.println("rong, khong the lay");
            return null;
        }
        Node temp = head;
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            for (int i = 2; i < size; i++) {
                temp = temp.next;
            }

            tail = temp;
            temp = temp.next;
            tail.next = null;
        }
        size--;
        return temp.value;
    }

    //d/  kiem tra rong
    public boolean isEmpty() {
        return head == null;
    }

    // e. tra ve so luong phan tu
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        for (int i = 0; i < size; i++) {
            sb.append(temp.value).append("\t");
        }
        return sb.toString();
    }


    //


}
