package stack;

import com.sun.tools.classfile.Synthetic_attribute;

public class StackByLinkedList {
    private Node top;
    public StackByLinkedList(){
        this.top=null;
    }
    static class Node{
        int value;
        Node next;
    }
    public void push(int value){
        if(isStackEmpty()){
            System.out.println("Stack is empty. pushing first element");
            Node temp= new Node();
            temp.value= value;
            temp.next=null;
            top=temp;
        }else{
            Node temp= new Node();
            temp.value= value;
            temp.next=top;
            top=temp;
            System.out.println("value pushed to stack");
        }
    }
    public int pop(){
        int value=-1;
        if (isStackEmpty()){
            System.out.println("Stack is empty. we can not pop element out of it");
        }else{
            value= top.value;
            System.out.println("Poped element is :"+value);
            top= top.next;
        }
        return value;
    }
    public void peek(){
        if(isStackEmpty()){
            System.out.println("Stack is empty.Nothing to peek");
        }else{
            System.out.println("Top of the stack is :"+top.value);
        }
    }

    public boolean isStackEmpty(){
        if(this.top==null){
            return  true;
        }else{
            return false;
        }
    }
    public void deleteCompleteStack(){
        top=null;
        System.out.println("Deleted complete Stack");
    }


}
