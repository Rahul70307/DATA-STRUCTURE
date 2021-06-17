package linkedList;

public class SingleLinkedListMain {
    public static void main( String[] args){
        SingleLinkedList list= new SingleLinkedList();
        list.createSingleLinkedList(1);
        list.insertInLinkedList(2,2);
        list.insertInLinkedList(4,3);
        list.insertInLinkedList(5,4);
        list.insertInLinkedList(3,3);
        list.insertInLinkedList(0,1);
        list.insertInLinkedList(-1,1);
        list.insertInLinkedList(-2,1);
        list.insertInLinkedList(9,19);


        list.traverseLinkedList();
    }
}
