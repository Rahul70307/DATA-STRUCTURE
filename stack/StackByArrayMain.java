package stack;

public class StackByArrayMain {
    public  static void main( String []args){
        StackByArray stack= new StackByArray(3);
        stack.push(1);
        stack.peek();
        stack.push(2);
        stack.peek();
        stack.push(3);
        stack.peek();
        stack.push(4);
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.peek();
        stack.deleteFullStack();
    }
}
