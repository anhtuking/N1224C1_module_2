package generic_stack_queue;

import java.util.*;

public class QueueStudy {
    public static void main(String[] args) {
        // Queue
        Queue queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add("20");
        queue.add(new Scanner(System.in));
        queue.add(30);
        queue.add(40);
        queue.add(50);

        int total = 0;
        while (!queue.isEmpty()) {
            Object obj = queue.remove();
            if (obj instanceof Integer) {
                total += (Integer) obj;
            }
            System.out.println(queue.remove());
        }

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
