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
    public void insertInLinkedList(int nodeValue, int location){
        SingleNode node= new SingleNode();
        node.setValue( nodeValue);
        node.setNext(null);
        if(location ==1){
            node.setNext(head);
            head= node;
        }
        else if (location >=getSize() ){
            tail.setNext(node);
            tail= node;
        }
        else{
            SingleNode tmp = head;
            int counter = 0;
            while( counter< location-2){
                tmp = tmp.getNext();
                counter++;
            }
            node.setNext(tmp.getNext());
            tmp.setNext(node);
        }
        setSize(getSize()+1);

    }
    public void traverseLinkedList(){
        SingleNode current = head;
        int length = getSize();
        for( int i =0; i<length;i++){
            System.out.print(current.getvalue());
            if(i!=getSize()-1){
                System.out.print("->");
            }
            current= current.getNext();
        }

    }
}
