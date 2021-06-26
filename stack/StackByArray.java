package stack;

import sun.tools.tree.ThisExpression;

public class StackByArray {
    int [] arr;
    int topOfStack;
    public StackByArray(int size){
        this.arr=new int[size];
        topOfStack=-1;
    }
    public void push(int value){
        if(isStackFull()){
            System.out.println("Stack is full. You can not push this data");
        }else{
            this.arr[++topOfStack]= value;
        }

    }
    public int pop(){
        if(isStackEmpty()){
            System.out.println("Stack is empty. You can not pop more item out of it");
            return -1;
        }else{
            System.out.println("Poping value from stack is :"+this.arr[topOfStack]);
            return this.arr[topOfStack--];
        }

    }
    public void peek(){
        if(isStackEmpty()){
            System.out.println("Stack is empty. Nothing to peek");

        }else{
            System.out.println("TOP OF THE STACK IS : "+ this.arr[topOfStack]);
        }
    }
    public boolean isStackEmpty(){
        if(topOfStack==-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isStackFull(){
        if(topOfStack==this.arr.length-1){
            return true;
        }else{
            return false;
        }
    }
    public void deleteFullStack(){
        this.arr=null;
        System.out.println("Stack is successfully deleted");
    }
}
