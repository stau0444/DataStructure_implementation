package LikedList;


public class LinkedList {
    Node head;
    int count;

    public boolean isEmpty(){
        return head==null;
    }
    public int getCount() {
        return count;
    }

    public LinkedList() {
        head = null;
        count = 0;
    }
    public Node addElement(String data){
        Node newNode = new Node(data);
        //처음 들어가는 노드일 경우 해당 노드를 head로 지정
        if(head == null){
        head = newNode;
        //첫 노드가 아닐 경우
        }else{
            //임시노드를 헤드로 지정하고
            Node temp = head;
            //마지막 노드를 찾아서
            while (temp.next != null){
                temp = temp.next;
            }
            //새로운 노드를 마지막 노드의 다음으로 지정
            temp.next = newNode;
        }
        //카운트를 추가
        count ++;
        return newNode;
    }
    public String getData(int position){
        Node headNode = head;
        if(position >= count){
            System.out.println("wrong position");
            return "wrong position error";
        }
        if(position == 0){
            return head.getData();
        }
        for (int i = 0; i<position; i++){
            headNode = headNode.next;
        }
        return headNode.getData();
    }
    public Node insertElement(int position , String data){
        int i;
        Node tempNode = head;
        Node preNode = null;

        Node newNode = new Node(data);
        if(position < 0 || position > count){
            System.out.println("wrong position");
            return null;
        }
        if(position == 0){
            newNode.next = head;
            head = newNode;
        }else{
            for(i=0; i<position; i++){
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }
    public Node removeElement(int position){
        int i;
        Node tempNode = head ;

        if(position ==0){
            head = tempNode.next;
        }else{
            Node preNode = null;
            for(i=0; i<position; i++){
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next;
        }
        count--;
        return tempNode;
    }
    public void printAllNodes(){
        Node thisNode = head;
        StringBuilder builder = new StringBuilder();
        while (true){
            if (thisNode.next!=null){
                builder.append(thisNode.getData()+"->");
                thisNode =thisNode.next;
            }else {
                builder.append(thisNode.getData());
                break;
            }
        }
        System.out.println(builder.toString());
    }
}
