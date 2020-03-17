package queue.QueueLinkedList;

public class QueueLinkedListExe {
    public static void main(String[] args) {
        QueueLinkedList queueLinkedList = new QueueLinkedList ();
        queueLinkedList.dequeue ();
        queueLinkedList.enqueue ( 2 );
        queueLinkedList.enqueue ( 3 );
        queueLinkedList.enqueue ( 4 );
        queueLinkedList.enqueue ( 5 );
        queueLinkedList.dequeue ();
        queueLinkedList.peek ( 3 );
        queueLinkedList.peek (0);
        queueLinkedList.display ();
    }
}
