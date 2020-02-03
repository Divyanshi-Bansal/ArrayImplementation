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

    public void deleteFirstNode(int value){
        //var second = first.next;
        //first.next = null;
        //first=second;

        Node current = first;
        while(current != null){
            if(current.data == value){
                first = previousNode ( current );
                current.data = 0;
                break;
            }
            current = current.next;
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

}
