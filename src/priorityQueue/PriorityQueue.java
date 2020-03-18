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


}
