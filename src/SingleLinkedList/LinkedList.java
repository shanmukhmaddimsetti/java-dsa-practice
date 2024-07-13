package SingleLinkedList;

public class LinkedList {
    Node head = null;
    Node tail = null;

//    Normal Approach O(n)
    void addNode(int data){

        if(head == null){
            head = new Node(data);
            return;
        }else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }

    }

//    Optimized Appraoch O(1)

    void insertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    void printLinkedList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    int lengthOfLinkedList(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
