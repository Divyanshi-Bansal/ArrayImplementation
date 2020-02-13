package Queue;

import java.util.Scanner;

public class QueueExe {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        Queue queue = new Queue ();
        int n = sc.nextInt ();//how many times user want to insert data
        for (int i = 0; i < n; i++) {
            int k= sc.nextInt ();
            queue.addLast ( k );
           }


        int d= sc.nextInt ();//how many times you want to delete element
        for (int j = 0; j < d; j++) {
            queue.deleteFirst ();
        }
        queue.displayNode ();
    }
}
