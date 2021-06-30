package tree;

import node.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeByLinkedList {
    public BinaryNode root;

    public BinaryTreeByLinkedList(){
        this.root=null;
    }

// traversing of linked list
    // pre-order traversal
    public void preOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
        System.out.print(node.getValue()+" ");
    }
    // post-order traversal
    public void postOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        System.out.print(node.getValue()+" ");
        postOrderTraversal(node.getLeft());
        postOrderTraversal(node.getRight());
    }
    // pre-order traversal
    public void inOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        inOrderTraversal(node.getLeft());
        System.out.print(node.getValue()+" ");
        inOrderTraversal(node.getRight());
    }
    public void levelOrderTraversal(){
        if(isTreeEmpty()){
            System.out.println("Tree is empty. Nothing to traverse");
            return;
        }else{
            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                BinaryNode current= queue.remove();
                System.out.print(current.getValue()+" ");
                if(current.getLeft()!=null){
                    queue.add(current.getLeft());
                }
                if(current.getRight()!=null){
                    queue.add(current.getRight());
                }
            }
        }
    }
    public boolean isTreeEmpty(){
        if(root==null)
            return true;
        else
            return false;
    }
    public void insert(int value){
        BinaryNode node = new BinaryNode();
        node.setValue(value);
        node.setLeft(null);
        node.setRight(null);
        if(isTreeEmpty()){
            System.out.println("Tree is empty. Creating first root node");
            root=node;

        }else{
            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                BinaryNode currentNode = queue.remove();
                if(currentNode.getLeft()==null){
                    currentNode.setLeft(node);
                    System.out.println("Successfully inserted the new node in tree");
                    return;
                }
                else if(currentNode.getRight()==null){
                    currentNode.setRight(node);
                    System.out.println("Successfully inserted the new node in tree");
                    return;
                }
                else{
                    queue.add(currentNode.getLeft());
                    queue.add(currentNode.getRight());
                }
            }
        }
    }

    public void deleteCompleteTree(){
        if(isTreeEmpty()){
            System.out.println("Tree is already empty");
        }else{
            root=null;
            System.out.println("Successfully deleted the tree");
        }
    }
    public void search(int val){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode current = queue.remove();
            if (current.getValue()==val){
                System.out.println("value :"+ val + " found in the tree");
                return;
            }else{
                if(current.getLeft()!=null){
                    queue.add(current.getLeft());
                }
                if(current.getRight()!=null){
                    queue.add(current.getRight());
                }
            }
        }
        System.out.println("Value :"+ val+ " not found in the tree");
    }
}




