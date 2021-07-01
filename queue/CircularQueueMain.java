package queue;

public class CircularQueueMain {
    public static void main(String[] args){
        CircularQueue cq= new CircularQueue(4);

        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);

        cq.dequeue();
        cq.dequeue();

        cq.enqueue(6);
        cq.enqueue(7);
        cq.enqueue(8);



    }
}
