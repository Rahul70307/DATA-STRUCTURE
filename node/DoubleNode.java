package node;

public class DoubleNode {
    private int value;
    private DoubleNode next;
    private DoubleNode prev;
    public void setValue(int value){
        this.value=value;
    }
    public int getValue(){
        return this.value;
    }
    public void setNext(DoubleNode node){
        this.next= node;
    }
    public DoubleNode getNext(){
        return this.next;
    }
    public void setPrev(DoubleNode node){
        this.prev= node;
    }
    public DoubleNode getPrev(){
        return this.prev;
    }
}
