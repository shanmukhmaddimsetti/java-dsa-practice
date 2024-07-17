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

    public void insertNodeAtPosition(int data, int pos){
        int count = 1;
    }

    public void printLinkedList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
