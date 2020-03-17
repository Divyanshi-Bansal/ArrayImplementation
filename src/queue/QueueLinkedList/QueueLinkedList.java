package queue.QueueLinkedList;

import linkedList.LinkedList;

public class QueueLinkedList {
    private LinkedList linkedList = new LinkedList ();
    private int size =0;
    private int maxsize;

    public void enqueue(int element){
        linkedList.addLast ( element );
        size++;
    }

    public void dequeue(){
        if(!linkedList.isEmpty ()){
            linkedList.deleteFirstNode ();
            size--;
        }
        else{
            System.out.println ("underflow");
        }
    }

    public void display(){
        linkedList.displayNode ();
    }

    public void peek(int element){
        System.out.println (linkedList.searchNode ( element ));
    }
}
