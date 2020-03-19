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

    public int  dequeue(){
        int response = -1;
        if(!isEmpty ()){
            response = arr[front];
            front++;
            size--;
        }
        else{
            System.out.println ("underflow");
        }
        return  response;
    }

    public void enqueue(int element){
        if(!isFull ()){
            arr[rear] = element;
            for(int i=0 ; i <= size ; i++ ){
                for(int j =0 ; j <= size ;j++){
                    if(arr[i] < arr[j]){
                        int c = arr[j];
                        arr[j] = arr[i];
                        arr[i] = c;
                    }
                }
            }
            rear++;
            size++;
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
