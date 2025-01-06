package generic_stack_queue.exercise1;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();

        //a
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);

        System.out.println("ngan xep " + myStack.toString());

        //b
        Integer peek = myStack.peek();
        System.out.println("Gia tri dau o ngan xep " + peek);

        //c
        Integer pop = myStack.pop();
        System.out.println("Gia tri lay ra ngan xep " + pop);

        //d
        boolean isEmpty = myStack.isEmpty();
        System.out.println("ngan xep co rong khong " + isEmpty);

        //e
        int size = myStack.size();
        System.out.println("kich thuoc ngan xep: " + size);
    }
}
