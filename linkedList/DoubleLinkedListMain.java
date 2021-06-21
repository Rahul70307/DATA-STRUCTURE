package linkedList;

public class DoubleLinkedListMain {
    public static void main(String args[]){
        DoubleLinkedList dll= new DoubleLinkedList();
        dll.insertINDoubleLinkedLIst(1,1);
        dll.insertINDoubleLinkedLIst(2,2);
        dll.insertINDoubleLinkedLIst(3,2);
        dll.traverseLinkedList();
        dll.deleteNodeAt(2);
        dll.traverseLinkedList();



    }
}
