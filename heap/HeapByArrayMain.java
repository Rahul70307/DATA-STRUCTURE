package heap;

public class HeapByArrayMain {
    public static void main( String [] args){
        HeapByArray minHeap = new HeapByArray(7);
        minHeap.insertIntoHeap(40);
        minHeap.insertIntoHeap(30);
        minHeap.insertIntoHeap(20);
        minHeap.insertIntoHeap(10);
        minHeap.insertIntoHeap(5);
        minHeap.insertIntoHeap(50);
        minHeap.insertIntoHeap(2);
        minHeap.insertIntoHeap(60);
        minHeap.peek();

//        minHeap.deleteFromHeap();
//        minHeap.deleteFromHeap();
//        minHeap.deleteFromHeap();
//        minHeap.deleteFromHeap();
//        minHeap.deleteFromHeap();
//        minHeap.deleteFromHeap();
//        minHeap.deleteFromHeap();
        minHeap.levelOrderTraversal();

    }
}
