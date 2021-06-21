package linkedList;

import com.sun.scenario.animation.shared.SingleLoopClipEnvelope;
import node.SingleNode;

public class SingleLinkedList {
    private SingleNode head;
    private SingleNode tail;
    private int size;

    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;

    }

    public SingleNode createSingleLinkedList(int nodeValue){
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        node.setNext(null);
        head= node;
        tail=node;
        size=1;
        return  head;

    }
//    public void insertInLinkedList1(int nodeValue, int location){
//        SingleNode node= new SingleNode();
//        node.setValue( nodeValue);
//        node.setNext(null);
//        if(location ==1){
//            node.setNext(head);
//            head= node;
//        }
//        else if (location >getSize() ){
//            tail.setNext(node);
//            tail= node;
//        }
//        else{
//            SingleNode tmp = head;
//            int counter = 0;
//            while( counter< location-2){
//                tmp = tmp.getNext();
//                counter++;
//            }
//            node.setNext(tmp.getNext());
//            tmp.setNext(node);
//        }
//        setSize(getSize()+1);
//
//    }
    public void insertInLikedList(int nodeValue, int location){
        SingleNode node= new SingleNode();
        node.setValue( nodeValue);

        if(!isExistsLinkedList()){
            System.out.println("LinkedList is empty. Creating the first node of linked list");
            node.setNext(null);
            head = tail = node;
            setSize(1);

        }
        else{
            if(location<=1){
                node.setNext(head);
                head=node;
            }else if(location>getSize()){
                node.setNext(null);
                tail.setNext(node);
                tail= node;
            }else{
                SingleNode currentNode= head;
                for(int i =1; i<location-1;i++){
                    currentNode= currentNode.getNext();
                }
                node.setNext(currentNode.getNext());
                currentNode.setNext(node);
            }
            setSize(getSize()+1);
        }
    }
    public void traverseLinkedList(){
        if(!isExistsLinkedList()){
            System.out.println(" linkedList is empty. Nothing to be deleted!!");
        }
        else{
            SingleNode current = head;
            int length = getSize();
            for( int i =0; i<length;i++){
                System.out.print(current.getvalue());
                if(i!=getSize()-1){
                    System.out.print("->");
                }
                current= current.getNext();
            }
            System.out.println("");

        }


    }
    public boolean isExistsLinkedList(){
        if( head!=null)
            return true;
        else
            return false;
    }

    public  void deleteCompleLinkedList(){
        if(head!=null){
            head=null;
            tail=null;
        }
    }
    public void deleteNodeAt(int location){
        int length= getSize();
        if(!isExistsLinkedList()){
            System.out.println("There is not node in the link list. LinkedList is empty");
        }else{
            if (location==1){
                if(head==tail){       //there is only one node condition
                    head= null;
                    tail=null;
                }else{
                    head=head.getNext();
                }
            }
            else if(location>=length){
                System.out.println("Entered location to be deleted is "+ location+" and the size of liked list is "+ getSize()+ " So deleting last node");
                if(head==tail){       //there is only one node condition
                    head= null;
                    tail=null;
                }
                SingleNode currentNode= head;
                SingleNode previousNode= null;
                while(currentNode.getNext()!=null){
                    previousNode=currentNode;
                    currentNode= currentNode.getNext();
                }
                System.out.println("deleting value at location = "+ location+ " is "+ currentNode.getvalue());
                previousNode.setNext(null);
                tail=previousNode;

            }else if (location<getSize()){
                SingleNode currentNode= head;
                SingleNode previousNode= null;
                for(int i=1; i<location;i++){
                    previousNode=currentNode;
                    currentNode= currentNode.getNext();
                }
                System.out.println("deleting value at location = "+ location+ " is "+ currentNode.getvalue());
                previousNode.setNext(currentNode.getNext());
            }
            setSize(getSize()-1);
        }
    }
}
