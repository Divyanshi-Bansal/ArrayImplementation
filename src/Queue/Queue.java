package Queue;

import queueADT.QueueADT;

public class Queue implements QueueADT {
    private Node front;
    private Node rear;

    private class Node{
        private int data;
        private Node next;
        private Node previous;

        private Node(int data){
            this.data = data;
        }
    }


    public void addLast(int value){
        Node node  = new Node ( value );
        if(front == null){
            front = rear = node;
            node.previous = null;
        }
        else{
            rear.next = node;
            node.previous = rear;
            rear = node;
        }
    }
    public  void deleteFirst(){

        front = front.next;
        front.previous = null;
//        var second = front.next;
//        front.next = null;
//        front  = second;
    }


    @Override
    public void addLast() {

    }

    //public void deleteFirst(){}

    public Node getRear() {
        return rear;
    }

    public Node getFront() {
        return front;
    }


    public void displayNode(){
        Node current  = front;
        while(current != null){
            System.out.println (current.data);
            current = current.next;
        }
    }
}
