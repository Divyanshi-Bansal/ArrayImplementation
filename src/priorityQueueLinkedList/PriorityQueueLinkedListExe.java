package priorityQueueLinkedList;



public class PriorityQueueLinkedListExe {
    public static void main(String[] args) {
        PriorityQueueLinkedList priorityQueueLinkedList = new PriorityQueueLinkedList ();
        priorityQueueLinkedList.enqueue ( 2 );
        priorityQueueLinkedList.enqueue ( 0 );
        priorityQueueLinkedList.enqueue ( 4 );
        priorityQueueLinkedList.enqueue ( -1 );
        priorityQueueLinkedList.enqueue ( 3 );
        priorityQueueLinkedList.dequeue ();
        priorityQueueLinkedList.peak ( 6 );
        priorityQueueLinkedList.peak ( 4 );
        priorityQueueLinkedList.display ();
    }
}
