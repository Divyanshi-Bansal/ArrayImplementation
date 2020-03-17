package queue.queue;

public class queueArrayExe {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray ( 5 );
        queue.enqueue ( 10 );
        queue.enqueue ( 15 );
        queue.enqueue ( 20 );
        queue.enqueue ( 25 );
        queue.enqueue ( 30 );
        queue.dequeue ();
        System.out.println (queue.peek ( 78 ));
        queue.display ();
    }
}
