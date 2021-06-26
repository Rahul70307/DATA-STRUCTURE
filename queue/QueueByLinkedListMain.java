package queue;

public class QueueByLinkedListMain {
    public static void main( String[] arg){
        QueueByLinkedList queue = new QueueByLinkedList();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.peek();
        queue.deQueue();
        queue.peek();
        queue.deQueue();
        queue.peek();
        queue.deQueue();
        queue.peek();
        queue.deQueue();
        queue.peek();

    }
}
