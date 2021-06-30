package tree;

public class BinaryTreeByLinkedListMain {

    public static void main(String[] arg){
        BinaryTreeByLinkedList bTree= new BinaryTreeByLinkedList();
//        bTree.deleteCompleteTree();
        bTree.insert(1);
        bTree.insert(2);
        bTree.insert(3);
        bTree.insert(4);
        bTree.insert(5);
        bTree.levelOrderTraversal();
        System.out.println("");
        bTree.search(2);
        bTree.search(7);
//        bTree.preOrderTraversal(bTree.root);
        System.out.println("");
        bTree.deleteCompleteTree();
//        bTree.inOrderTraversal(bTree.root);
//        bTree.postOrderTraversal(bTree.root);

    }


}
