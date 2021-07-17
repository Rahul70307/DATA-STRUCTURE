package heap;

public class HeapByArray {
    private int []arr;
    private int sizeOfTree;

    public HeapByArray(int arraySize){
        arr= new int[arraySize+1];
        sizeOfTree=0;
    }
    public void insertIntoHeap(int value){
        if(sizeOfTree>=arr.length){
            System.out.println("Heap is full");
        }else{
            arr[++sizeOfTree]=value;
            heapifyFromBotttomToUp(sizeOfTree);
            System.out.println("Inserted "+value+" into the heap");
//            levelOrderTraversal();
        }

    }
    public int deleteFromHeap(){
        if(sizeOfTree==0){
            System.out.println("Heap is empty");
            return -1;
        } else{
            int temp = arr[1];
            arr[1]=arr[sizeOfTree--];
            heapifyFromToptoBottom(1);
            return temp;
        }


    }
    private void heapifyFromBotttomToUp(int index){
        int parent = index/2;
        if(index<=1){
            return;
        }
        if(arr[index]<arr[parent]){
            int temp = arr[index];
            arr[index]= arr[parent];
            arr[parent]=temp;
            heapifyFromBotttomToUp(parent);
        }
        return;


    }
    private void heapifyFromToptoBottom(int index) {
        int left = index * 2;
        int right = (index * 2) + 1;
        int smallestChild = Integer.MAX_VALUE;
        if (sizeOfTree < left) {
            return;
        } else if (sizeOfTree == left) {
            if (arr[index] > arr[left]) {
                int temp = arr[left];
                arr[left] = arr[index];
                arr[index] = temp;


            }
            return;

        } else {
            if (arr[left] < arr[right]) {
                smallestChild = left;
            } else {
                smallestChild = right;
            }
            if(arr[index]>arr[smallestChild]){
                int temp = arr[index];
                arr[index] = arr[smallestChild];
                arr[smallestChild] = temp;
            }
        }
        heapifyFromToptoBottom(smallestChild);
    }
    public void levelOrderTraversal(){
        if(sizeOfTree==0){
            System.out.println("Heap is Empty");
            return;
        }
        for( int i=1; i<=sizeOfTree;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
}
