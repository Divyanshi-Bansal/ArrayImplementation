package priorityQueue;

import java.util.Scanner;

public class PriorityQueueExe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        PriorityQueue priorityQueue = new PriorityQueue ( 7 );
        priorityQueue.dequeue ();
        priorityQueue.enqueue ( 2 );
        priorityQueue.enqueue ( 3 );
        priorityQueue.enqueue ( 1 );
        priorityQueue.enqueue ( 5 );
        priorityQueue.enqueue ( 5 );
        priorityQueue.enqueue ( 0 );
        priorityQueue.enqueue ( -1 );
        System.out.println (priorityQueue.peak ( 4 ));
        priorityQueue.dequeue ();

        priorityQueue.display ();
    }
}
