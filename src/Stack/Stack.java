package Stack;


import ArrayList.ArrayImpl;

public class Stack {
    ArrayImpl arrayStack;
    int top ;

    public Stack() {
        this.arrayStack = new ArrayImpl();
        this.top = 0;
    }

    public Stack(int size) {
        this.arrayStack = new ArrayImpl(size);
        this.top = 0;
    }

    //데이터 넣기
    public void push(int data){
        if (isFull()){
            System.out.println("stack is Full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }
    //맨위의 데이터 꺼내기
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is Empty");
            return ArrayImpl.ERROR_NUM;
        }
        return arrayStack.removeElement(--top);
    }
    //맨위의 데이터 확인
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is Empty");
            return ArrayImpl.ERROR_NUM;
        }
        return arrayStack.get(--top);
    }


    public boolean isEmpty(){
        return top == 0;
    }
    public boolean isFull(){
        return (top == arrayStack.ARRAY_SIZE);
    }

    public void printAll(){
        arrayStack.printAll();
    }
}
