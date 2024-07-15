package DoubleLinkedList;

public class LinkedList {
    Node head = null;
    Node tail = null;

    public void insertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = tail.next;
            newNode.prev = tail;
            tail = newNode;
        }
    }
}
