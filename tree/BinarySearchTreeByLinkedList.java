package tree;

import com.sun.prism.shader.Solid_RadialGradient_REFLECT_AlphaTest_Loader;
import node.BinaryNode;

import javax.sql.rowset.spi.SyncResolver;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeByLinkedList {
    BinaryNode root;

    public BinarySearchTreeByLinkedList(){
        root=null;
    }
    public void insert(int val){
        root=insert(root,val);
    }

    public BinaryNode insert(BinaryNode node, int val){
        if(root==null){
            System.out.println("Its an empty tree. Inserting the first root node");
            BinaryNode tmp= new BinaryNode();
            tmp.setValue(val);
            tmp.setRight(null);
            tmp.setLeft(null);
            root=tmp;
            return root;
        }
        else if(node==null){
            System.out.println("Its not an empty tree. Inserting new node");
            BinaryNode tmp= new BinaryNode();
            tmp.setValue(val);
            tmp.setRight(null);
            tmp.setLeft(null);
            return tmp;
        }
        else if(node.getValue()>=val){
             node.setLeft(insert(node.getLeft(),val));
             return node;
        }else{
             node.setRight(insert(node.getRight(),val));
             return node;
        }
    }
    public void traverseBSTInOrder(BinaryNode currenNode){
        if(currenNode==null)
        {
            return;
        }
        traverseBSTInOrder(currenNode.getLeft());
        System.out.print(currenNode.getValue()+" ");
        traverseBSTInOrder(currenNode.getRight());

    }
    public void deleteNode(int val){
        System.out.println("Deleting "+val+ " from BST");
        deleteNodeOfBST( root, val);
    }
    public BinaryNode deleteNodeOfBST(BinaryNode node, int val){
       if(root==null){
           System.out.println("Tree is empty!!! Cant delete "+ val+ " from the BST");
           return null;
       }
       else{
           if(node==null){
               System.out.println("reached to the end . Cant find the value in the BST");
               return node;
           }
           if(val<node.getValue()){
              node.setLeft(deleteNodeOfBST(node.getLeft(),val)) ;
           }
           else if(val>node.getValue()){
               node.setRight(deleteNodeOfBST(node.getRight(),val));

           }
           else{
               if(node.getLeft()!=null && node.getRight()!=null){
                   BinaryNode minimum = minimumElement(node.getRight());
                   node.setValue(minimum.getValue());
                   node.setRight(deleteNodeOfBST(node.getRight(),minimum.getValue()));

               }
               else if(node.getLeft()!=null){
                   node= node.getLeft();
               }
               else if(node.getRight()!=null){
                   node=node.getRight();
               }
               else{
                   node = null;
               }
           }
           return node;
       }

    }

    private BinaryNode minimumElement(BinaryNode node) {
        if(node.getLeft()==null)
            return node;
        else{
             return minimumElement(node.getLeft());
        }


    }
    public void searchForValue(int value){
        search(root,value);
    }
    public boolean search(BinaryNode node,int val){
        if(node==null){
            System.out.println("Value not found in BST");
            return false;
        }
        else if(node.getValue()==val){
            System.out.println("element found");
            return true;
        }
        else if(val<node.getValue()){
            return search(node.getLeft(),val);
        }
        else{
            return search(node.getRight(),val);
        }

    }
    void printTreeGraphically() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        Queue<Integer> level = new LinkedList<Integer>();

        int CurrentLevel = 1;
        boolean previousLevelWasAllNull = false;
        queue.add(root);
        level.add(1);

        System.out.println("\nPrinting Level order traversal of Tree...");
        if(root == null) {
            System.out.println("Tree does not exists !");
            return;
        }

        while (!queue.isEmpty()) {
            if(CurrentLevel == level.peek()) { //if we are in the same level
                if(queue.peek()==null) {
                    queue.add(null);level.add(CurrentLevel+1);
                }else {
                    queue.add(queue.peek().getLeft());level.add(CurrentLevel+1);
                    queue.add(queue.peek().getRight());level.add(CurrentLevel+1);
                    previousLevelWasAllNull = false;
                }
                System.out.print(queue.remove() + "  ");level.remove();
            }else { //level has changed
                System.out.println("\n");
                CurrentLevel++;
                if(previousLevelWasAllNull == true) {
                    break;
                }
                previousLevelWasAllNull = true;
            }
        }//end of loop
    }//end of method



}
