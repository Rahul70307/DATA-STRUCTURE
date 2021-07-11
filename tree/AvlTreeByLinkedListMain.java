package tree;

public class AvlTreeByLinkedListMain {
    public static void main( String [] arg){
        AvlTreeByLinkedList avl = new AvlTreeByLinkedList();
        avl.insert(20);
        avl.insert(25);
        avl.insert(30);
        avl.insert(10);
        avl.insert(5);
        avl.insert(15);
        avl.insert(27);
        avl.insert(19);
        avl.insert(16);
        avl.insert(28);
        avl.deleteNode(27);
        avl.search(20);
        avl.search(25);
        avl.search(30);
        avl.search(10);
        avl.search(5);
        avl.search(15);
        avl.search(27);
        avl.search(19);
        avl.search(16);
        avl.search(78);
        avl.printTreeGraphically();

    }
}
