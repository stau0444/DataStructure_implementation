package Queue;

import LikedList.LinkedList;
import LikedList.Node;

interface IQueue{
    public void enQueue(String data);
    public String deQueue();
    public void printQueue();
}
public class Queue extends LinkedList implements IQueue {

    Node front;
    Node rear;

    @Override
    public void enQueue(String data) {
        if(isEmpty()){
            Node node = addElement(data);
            front = node;
            rear = node;
        }else{
            rear = addElement(data);
        }
        System.out.println("front = " + front.getData() +", rear = "+rear.getData());
    }



    @Override
    public String deQueue() {
        if(isEmpty()){
            System.out.println("empty");
            return null;
        }
        String data = front.getData();
        removeElement(0);
        front = front.next;

        if (front == null){
            rear = null;
        }
        return data;
    }

    @Override
    public void printQueue() {
        printAllNodes();
    }
}
