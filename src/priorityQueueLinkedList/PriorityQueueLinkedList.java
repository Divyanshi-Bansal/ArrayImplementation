package priorityQueueLinkedList;

import linkedList.LinkedList;

public class PriorityQueueLinkedList {
    LinkedList linkedList = new LinkedList ();
    private int size =0 ;
    private int maxSize ;

    public void enqueue(int element){
        linkedList.addThroughSorting ( element );
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
        this.linkedList.displayNode ();
    }

    public void peak(int element){
        System.out.println (linkedList.searchNode ( element ));
    }
}
