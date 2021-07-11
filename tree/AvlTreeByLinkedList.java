package tree;

import node.AvlNode;
import node.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class AvlTreeByLinkedList {
    private AvlNode root;
    public AvlTreeByLinkedList(){
        root=null;
    }

    public void insert(int item){
       root= insert( root, item);
    }
    public AvlNode insert( AvlNode node ,int item){

        if(node==null){
            AvlNode temp = new AvlNode();
            temp.setData(item);
            temp.setHeight(1);
            return temp;

        }
        else if (item<node.getData()){
            node.setLeft(insert(node.getLeft(),item));
        }
        else if(item>node.getData()){
            node.setRight(insert(node.getRight(),item));
        }
        int nodeHeight = Math.max(getHeight(node.getLeft()),getHeight(node.getRight()))+1;
        node.setHeight(nodeHeight);

        int bf = bf(node);
        if(bf>1 && item<node.getLeft().getData()){//LL case
             return rotateRight(node);
        }
        else if(bf>1 && item>node.getLeft().getData()){//LR case
             node.setLeft(rotateLeft(node.getLeft()));
              return rotateRight(node);
        }
        else if(bf<-1 && item>node.getRight().getData()) {//RR case{
            return rotateLeft(node);
        }

        else if(bf<-1 && item<node.getRight().getData()){//RL Case
            node.setRight(rotateRight(node.getRight()));
            return rotateLeft(node);

        }
         return node;
    }
    public int getHeight(AvlNode node){
        if(node==null){
            return 0;
        }
        else{
            return node.getHeight();
        }
    }
    public int bf(AvlNode node){
        if(node==null){
            return 0;
        }else{
            return (getHeight(node.getLeft())-getHeight(node.getRight()));
        }
    }
    public AvlNode rotateRight(AvlNode c){
        AvlNode b = c.getLeft();
        AvlNode T3 = b.getRight();
        b.setRight(c);
        c.setLeft(T3);
        c.setHeight(Math.max(getHeight(c.getLeft()),getHeight(c.getRight()))+1);
        b.setHeight(Math.max(getHeight(b.getLeft()),getHeight(b.getRight()))+1);
        return b;

    }

    public AvlNode rotateLeft(AvlNode c){
        AvlNode b = c.getRight();
        AvlNode T3 = b.getLeft();
        b.setLeft(c);
        c.setRight(T3);
        c.setHeight(Math.max(getHeight(c.getLeft()),getHeight(c.getRight()))+1);
        b.setHeight(Math.max(getHeight(b.getLeft()),getHeight(b.getRight()))+1);
        return b;

    }

    public void deleteNode(int item){
        root= deleteNode(root, item);
    }
    public AvlNode deleteNode(AvlNode node, int item){
        if( node== null){
            System.out.println("Node to be delete is not found in Avl tree");
            return null;
        }else{
            if(item<node.getData()){
                node.setLeft(deleteNode(node.getLeft(),item));
            }
            else if(item>node.getData()){
                node.setRight(deleteNode(node.getRight(),item));

            }
            else{
                if(node.getLeft()!=null && node.getRight()!= null){
                    AvlNode minimum = minimumElement(node.getRight());
                    node.setData(minimum.getData());
                    node.setRight(deleteNode(node.getRight(),minimum.getData()));

                }
                else if(node.getLeft()!=null){
                    node= node.getLeft();
                }
                else if(node.getRight()!=null){
                    node= node.getRight();
                }else{
                    node=null;
                    return node;
                }
                int nodeHeight = Math.max(getHeight(node.getLeft()),getHeight(node.getRight()))+1;
                node.setHeight(nodeHeight);

                int bf = bf(node);
                if(bf>1 && item<node.getLeft().getData()){//LL case
                    return rotateRight(node);
                }
                else if(bf>1 && item>node.getLeft().getData()){//LR case
                    node.setLeft(rotateLeft(node.getLeft()));
                    return rotateRight(node);
                }
                else if(bf<-1 && item>node.getRight().getData()) {//RR case{
                    return rotateLeft(node);
                }

                else if(bf<-1 && item<node.getRight().getData()){//RL Case
                    node.setRight(rotateRight(node.getRight()));
                    return rotateLeft(node);

                }
            }
            return node;
        }
    }

    private AvlNode minimumElement(AvlNode node) {
        if(node.getLeft()==null)
            return node;
        else{
            return minimumElement(node.getLeft());
        }


    }

    public void search(int item){
         search( root, item);
    }
    private void search( AvlNode node, int item){
        if( node== null){
            System.out.println(item+ " not present in the avl tree");

        }else if(item<node.getData()){
            search(node.getLeft(),item);
        }else if ( item>node.getData()){
            search(node.getRight(),item);
        }else{
            System.out.println(item+" found in the AVl tree");

        }

    }

    void printTreeGraphically() {
        Queue<AvlNode> queue = new LinkedList<AvlNode>();
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
                AvlNode temp = queue.remove();
                if(temp!=null){
                    System.out.print(temp.getData() + "  ");
                }else {
                    System.out.print(temp + "  ");
                }
                level.remove();
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
