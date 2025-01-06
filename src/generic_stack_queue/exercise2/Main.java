package generic_stack_queue.exercise2;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();

        //a
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);

        System.out.println("Hang doi:" + myQueue.toString());

        //b
        Integer peekValue = myQueue.peek();
        System.out.println("Giá trị ở đầu hàng đợi " + peekValue);

        //c
        Integer pollValue = myQueue.poll();
        System.out.println("Giá trị lấy ra: " + pollValue);

        //d
        boolean isEmpty = myQueue.isEmpty();
        System.out.println("Hang doi co trong khong : " + isEmpty);

        //e
        int myQueueSize = myQueue.size();
        System.out.println("Kich thuoc cua hang doi la: " + myQueueSize);
    }
}
