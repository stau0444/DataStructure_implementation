package LikedList;

public class Node {
    private String data;
    public Node next;

    public Node() {
        data = null;
        next = null;
    }
    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public Node(String data, Node link) {
        this.data = data;
        this.next = link;
    }

    public String getData() {
        return data;
    }
}
