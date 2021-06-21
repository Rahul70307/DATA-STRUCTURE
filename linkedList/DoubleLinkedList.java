package linkedList;

import node.DoubleNode;
import node.SingleNode;

public class DoubleLinkedList {
    private DoubleNode head;
    private DoubleNode tail;
    private int size;
    public void setSize(int size){
        this.size=size;
    }
    public int getSize(){
        return this.size;
    }

    public void insertINDoubleLinkedLIst(int value, int location){
        DoubleNode temp=new DoubleNode();
        temp.setValue(value);
        if(!isExistsDoubleLinkedList()){
            System.out.println("Double Linked List is empty. So creating the first node");
            temp.setNext(null);
            temp.setPrev(null);
            head=temp;
            tail=temp;
            setSize(1);
        }else{
            if(location<=1){
                System.out.println("Inserting the node at the begining");
                temp.setNext(head);
                temp.setPrev(null);
                head=temp;
            }else if(location>getSize()){
                temp.setNext(null);
                temp.setPrev(tail);
                tail.setNext(temp);
                tail= temp;
            }else{
                DoubleNode current = head;
                DoubleNode prevOfCurrent= null;
                for(int i=1;i<location;i++){
                    prevOfCurrent=current;
                   current=current.getNext();
                }
                temp.setNext(current);
                temp.setPrev(prevOfCurrent);
                current.setPrev(temp);
                prevOfCurrent.setNext(temp);

            }
            setSize(getSize()+1);
        }

    }
    public void traverseLinkedList(){
        if(!isExistsDoubleLinkedList()){
            System.out.println(" linkedList is empty. Nothing to be deleted!!");
        }
        else{
            DoubleNode current = head;
            int length = getSize();
            for( int i =0; i<length;i++){
                System.out.print(current.getValue());
                if(i!=getSize()-1){
                    System.out.print("->");
                }
                current= current.getNext();
            }
            System.out.println("");
        }
    }

    public boolean isExistsDoubleLinkedList(){
        if(head==null){
            return false;
        }else{
            return true;
        }
    }
    public void deleteCompleteDoubleLinkedList(){
        if(!isExistsDoubleLinkedList()){
            System.out.println("Doubly Linked List is empty. Nothing to delete");

        }else{
            head=null;
            tail=null;
        }
    }
    public void deleteNodeAt(int location){
        if(!isExistsDoubleLinkedList()){
            System.out.println("Doubly Linked List is empty. Nothing to delete");
        }else{
            if(location<=1){
                if(head.getNext()==null){
                    head=tail=null;

                }else{
                    DoubleNode temp=head.getNext();
                    temp.setPrev(null);
                    head=temp;
                }
            }else if(location>=getSize()){
                DoubleNode temp= tail.getPrev();
                tail.setPrev(null);
                temp.setNext(null);
                tail=temp;
            }else{
                DoubleNode currentNode= head;
                DoubleNode previousNode= null;
                for(int i=0;i<location-1;i++){
                    previousNode=currentNode;
                    currentNode=currentNode.getNext();
                }
                DoubleNode nextNode= currentNode.getNext();
                currentNode.setNext(null);
                nextNode.setPrev(previousNode);
                currentNode.setPrev(null);
                previousNode.setNext(nextNode);
            }
            setSize(getSize()-1);
        }

    }

}
