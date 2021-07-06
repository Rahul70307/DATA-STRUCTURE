package tree;

public class BinarySearchTreeByLinkedListMain {

    public static void main(String[] args){
        BinarySearchTreeByLinkedList bst = new BinarySearchTreeByLinkedList();
        bst.insert( 100);
        bst.insert(30);
        bst.insert(200);
        bst.insert(40);
        bst.insert(150);
        bst.deleteNode(100);
        bst.searchForValue(30);

        bst.traverseBSTInOrder(bst.root);

    }



}
