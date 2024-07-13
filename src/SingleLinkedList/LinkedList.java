package SingleLinkedList;

public class LinkedList {
    Node head = null;
    Node tail = null;

//    Normal Approach O(n^2)
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

//    Optimized Approach O(1)

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

    void insertAtHead(int data){
        Node newNode  = new Node(data);
        newNode.next = head;
        head = newNode;
        return;
    }
    void insertAtPosition(int data, int pos){
        if (pos == 1){
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        int count = 1;
        Node temp = head;

        while(count != (pos - 1)){
            count++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteHead(){
        if (head == null){
            return;
        }
        head = head.next;
        return;
    }

    void deleteAtPosition(int pos){
        if (head == null){
            return;
        }
        if(pos <= 0 || pos > lengthOfLinkedList()){
            return;
        }
        if (pos == 1){
            head = head.next;
            return;
        }
        int count = 1;
        Node temp = head;

        while(temp != null && count < (pos - 1)){
            count++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    void printLinkedList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(temp);
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

    void incrementNodeValue(){
        Node temp = head;
        while (temp != null){
            temp.data++;
            temp = temp.next;
        }
    }

    void decrementNodeValue(){
        Node temp = head;
        while (temp != null){
            temp.data--;
            temp = temp.next;
        }
    }
}
