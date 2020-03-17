package queue.queue;

//Queue through Array...

public class QueueArray {
    private int front;
    private int rear;
    private int[] queue;
    private int size;
    private int maxSize;

    public QueueArray(int maxSize ){
        this.maxSize = maxSize;
        this.front = 0;
        this.rear=0;
        this.size=0;
        queue = new int[maxSize];
    }

    public void enqueue(int element){//add element
        if(!isFull ()){
            queue[rear]=element;
            rear++;
            size++;
        }
        else{
            System.out.println ("overflow");
        }
    }

    public int dequeue(){
        int response=-1;
        if(!isEmpty ()){
               response = queue[front];
               front++;
               size--;
        }
        else{
            System.out.println ("underflow");
        }
        return response;
    }

    public boolean peek(int element){//search
        for(int i= front ; i< size ;i++){
            if(queue[i] == element){
                return true;
            }
        }
        return false;
    }

    public void display(){
        for (int i=0;i<size;i++){
            System.out.print(queue[i+front]+" ");
        }
    }

    private boolean isEmpty(){
        return size==0;
    }

    private boolean isFull(){
        return size==maxSize;
    }
}
