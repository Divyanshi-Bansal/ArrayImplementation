package linkedList;

public class LinkedList {
    private Node first;
    private Node last;
    private class Node{
        private int data;
        private Node next;


        public Node(int item){
            this.data = item;
        }
    }

    public void addLast(int value){
        Node node = new Node ( value);
        if(first==null){
            first=last=node;
        }
        else{
            last.next = node;
            last = node;
        }
    }

    public void addfirst(int value){
        Node node = new Node ( value );
        if(first == null){
            first = last = node;
        }
        else{
            node.next = first;
            first = node;
        }
    }

    public void indexOf(int element){
        Node current =first;
        int index=0;
        while(current!=null){
            if(current.data==element){
                System.out.println (index);
                break;
            }
            index++;
            current=current.next;
        }
    }

   public void deleteFirstNode() { //int value likhna hai
        var second = first.next;
        first.next = null;
        first = second;
    }
    public void deleteAtAnyPosition(int position){
        Node current = first;
        Node previous = first;
        Node tempo = first;
        if(position >0) {
            int i = 0;
            while (i <= position - 1) {
                previous = current;
                current = current.next;
                i++;
            }

            current = previous.next;
            previous.next = current.next;
            tempo = current.next;
        }
        else{
            var second = first.next;
            first.next = null;
            first = second;
            tempo = second;
        }
        while(tempo != null){
            tempo = tempo.next;
        }
    }


    public void displayNode(){
        Node current = first;
        while(current !=null){
            System.out.println (current.data);
            current = current.next;
        }

    }

    private Node previousNode(Node node){
        Node current= first;
        while(current.next!=null){
            if(current.next==node){
                return current;
            }
            current=current.next;
        }
        return null;
    }

    public int  lastNode(){
        return last.data;
    }
    public Boolean isEmpty(){
        if(first == null){
            return true ;
        }
        return false;
    }

    public Node insertNodeAtPosition( int value, int position) {
        Node node = new Node ( value );
        int i = 0;
        Node current = first;
        Node previous = first;
        while (i < position) {
            previous = current;//13
            current = current.next;//7

            i++;
        }
        previous.next = node;
        node.next = current;
        while (current != null) {
            //System.out.println (current.data +"*");


            current = current.next;
        }
        return  first;
    }

    public  Node removeDuplicates() {

        Node current = first;
        Node tempo = null;
        //Node temp = null;
        while(current != null){
            Node temp = current.next;
            //System.out.println (temp.data);
            if(current.data == temp.data){
                tempo = previousNode( current );
                //System.out.println (tempo.data);
                tempo = current.next;
                current = null;
            }
            current = current.next;
        }
        return first;
    }

    public String searchNode(int value){
        Node node = new Node ( value );
        Node current = first;
        while(current != null){
            if(current.data == node.data){
                String found;
                return "found";
            }
            current = current.next;
        }
        return "notfound";
    }

    public void addThroughSorting(int value){
        Node node = new Node(value);

        if(first == null){
            first = last = node;
        }
        else {
            last.next = node;
            last = node;
            Node current = first;
            while (current != null) {
                if (node.data < current.data) {
                    int c = node.data;
                    node.data = current.data;
                    current.data = c;
                }
                current = current.next;
            }

        }
    }

}
