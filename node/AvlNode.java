package node;

public class AvlNode {
    private int data;
    private AvlNode left;
    private AvlNode right;
    private int height;

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setLeft(AvlNode left) {
        this.left = left;
    }
    public AvlNode getLeft(){
        return left;
    }
    public void setRight(AvlNode right){
        this.right=right;
    }
    public AvlNode getRight(){
        return right;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getHeight(){
        return height;
    }
}
