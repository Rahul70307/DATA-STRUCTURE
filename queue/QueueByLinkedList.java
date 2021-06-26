package queue;

import com.sun.tools.javac.file.SymbolArchive;

public class QueueByLinkedList {
    private Node beginingOfQueue;
    private Node topOfQueue;

    static class Node{
        int value;
        Node next;
    }

    public boolean isQueueEmpty(){
        if(beginingOfQueue==null){
            return true;
        }else{
            return false;
        }

    }

    public void enQueue(int value){
        Node temp= new Node();
        temp.value= value;
        temp.next=null;
        if(isQueueEmpty()){
            System.out.println("Queue is empty. Inserting first element in the queue");
            beginingOfQueue=topOfQueue=temp;
        }else{
            topOfQueue.next=temp;
            topOfQueue=topOfQueue.next;
        }
    }
    public void deQueue(){
        if(isQueueEmpty()){
            System.out.println(" Queue is empty. Nothing to Delete");
        }else{
            System.out.println("Deleted start of the queue is :"+beginingOfQueue.value);
            if(beginingOfQueue==topOfQueue){
                beginingOfQueue=topOfQueue=null;
            }else{
                beginingOfQueue= beginingOfQueue.next;
            }
        }
    }
    public int peek(){
        if(isQueueEmpty()){
            System.out.println("Queue is empty. Nothing to peek");
            return -1;
        }
        else{
            System.out.println("Start of the queue is :"+beginingOfQueue.value);
            return beginingOfQueue.value;
        }
    }



}
