package queue;

public class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;

    public CircularQueue(int size){
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }else if(isEmpty()){
            System.out.println("Queue was empty.Inserted first element");
            front=rear=0;
        }else{
            rear=(rear+1)% arr.length;
        }
        arr[rear]=value;
    }

    public int dequeue(){
        int x=0;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }else if(front==rear){
           x=arr[front];
           System.out.println("deleted element from front is :"+x);
           front=rear=-1;
        }else{
            x=arr[front];
            front=(front+1)%arr.length;
        }
        return x;
    }

    public boolean isEmpty(){
        if(front==-1 && rear==-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if((rear+1)%arr.length==front){
            return true;
        }else{
            return false;
        }
    }
}
