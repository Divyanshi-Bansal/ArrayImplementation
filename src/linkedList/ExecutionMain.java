package linkedList;

public class ExecutionMain {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList ();
        ll.addLast ( 12 );
        ll.addLast ( 13 );
        ll.addLast ( 20 );
        ll.addfirst ( 10 );
        //ll.indexOf ( 10 );
//        ll.deleteFirstNode ();
        System.out.println (ll.searchNode ( 10 ));
        ll.insertNodeAtPosition ( 11,4);
       // ll.removeDuplicates (  );
        ll.displayNode ();



    }


}
