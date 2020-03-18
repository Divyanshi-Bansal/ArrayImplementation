package priorityQueue;

public class PriorityQueue {
    private int front;
    private int rear;
    private int[] arr;
    private int size;
    private int maxSize;

    public PriorityQueue(int maxSize){
        this.maxSize = maxSize;
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        arr = new int[maxSize];
    }

    private boolean isEmpty(){
        return size==0;
    }
    private boolean isFull(){
        return size == maxSize;
    }

    public void dequeue(){
        if(!isEmpty ()){
            int response = arr[front];
            front++;
            size--;
        }
        else{
            System.out.println ("underflow");
        }
    }

    public void enqueue(int element){
        if(!isFull ()){
            for(int i=front ; i<maxSize ; i++){
                for(int j =front ; j< maxSize ; j++){
                    if(arr[i] > arr[j+1]){
                        int c = arr[j+1];
                        arr[j+1] = arr[i];
                        arr[i] = c;
                    }
                }
            }
        }
        else{
            System.out.println ("overflow");
        }
    }

    public boolean peak(int element){
        for(int i=0; i<maxSize ;i++){
            if(arr[i] == element){
                return true;
            }
        }
        return  false;
    }

    public void display(){
        for (int i=0;i<size;i++){
            System.out.print(arr[i+front]+" ");
        }
    }

}
