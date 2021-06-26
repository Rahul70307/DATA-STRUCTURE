package stack;

public class StackByLinkedListMain {
    public static void main(String[] arg){
        StackByLinkedList stack = new StackByLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.deleteCompleteStack();
        stack.peek();


    }


}
