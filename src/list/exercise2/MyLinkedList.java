package list.exercise2;

public class MyLinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    private int size;

    // add first
    public void addFisrt(int value) {
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

    // add last
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // thêm 1 phần tử vào vị trí index
    public void add(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("");
        } else if (index == 1) {
            addFisrt(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            Node newNode = new Node(value);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    public Integer removeFirst() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        size--;
        return temp.value;
    }

    public Integer removeLast() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            for (int i = 2; i < size; i++) {
                temp = temp.next;
            }
            tail = temp;
            temp = temp.next;
            temp.next = null;

        }
        size--;
        return temp.value;
    }

    // remove index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println(" ");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    // lay phan tu dau tien
    public Integer getFirst() {
        if (head == null) {
            return null;
        }
        return head.value;
    }

    // lay phan tu cuoi
    public Integer getLast() {
        if (tail == null) {
            return null;
        }
        return tail.value;
    }

    //  lay tai vi tri index
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    // k.
    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println(" ");
            return;
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.value = value;
        }
    }


    // indexOf
    public Integer indexOf(int value) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == value) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    // lastIndexOf
    public Integer lastIndexOf(int element) {
        int lastIndex = 1;
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == element) {
                lastIndex = i;
            }
            temp = temp.next;
        }
        return lastIndex;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node current = head;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(current.value).append(" ");
            current = current.next;
        }
        return stringBuilder.toString();
    }
}
