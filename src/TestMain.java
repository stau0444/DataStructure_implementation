import LikedList.LinkedList;
import LikedList.Node;
import Queue.Queue;
import Stack.Stack;

public class TestMain {
    public static void main(String[] args) {


//        Stack stack = new Stack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        int pop = stack.pop();
//        int pop2 = stack.pop();
//        int peek = stack.peek();
//        System.out.println("--------------");
//        System.out.println("pop = " + pop);
//        System.out.println("pop2 = " + pop2);
//        System.out.println("peek = " + peek);
//        System.out.println("--------------");
//
//        stack.printAll();

        Queue queue = new Queue();
        queue.enQueue("a");
        queue.enQueue("b");
        queue.enQueue("c");
        queue.printQueue();

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.printQueue();

    }
}
