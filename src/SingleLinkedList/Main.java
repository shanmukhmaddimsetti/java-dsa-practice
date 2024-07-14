package SingleLinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while (true){
            System.out.println("1. Insert Into Single Linked List: ");
            System.out.println("2. Length of the Single Linked List: ");
            System.out.println("3. Print the Single Linked List: ");
            System.out.println("4. Insert at specific position: ");
            System.out.println("5. Delete at position: ");
            System.out.println("6. Remove Consecutive Duplicates from the Linked List: ");
            System.out.println("7. Reverse the Linked List: ");
            System.out.println("8. Find Middle element of Linked List");
            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Inserting into Linked List: ");
                    System.out.println("Enter the data to be inserted: ");
                    int data = sc.nextInt();
                    list.insertNode(data);
                    break;
                case 2:
                    System.out.println("Lenght of the Single Linked List: " + list.lengthOfLinkedList());
                    break;
                case 3:
                    System.out.println("Printing the Linked List: ");
                    list.printLinkedList();
                    break;
                case 4:
                    System.out.println("Inserting at Specific Position of Linked List: ");
                    System.out.println("Enter data to insert: ");
                    int ele = sc.nextInt();
                    System.out.println("Enter the position to insert: ");
                    int pos = sc.nextInt();
                    list.insertAtPosition(ele, pos);
                    break;
                case 5:
                    System.out.println("Deleting at position: ");
                    int position = sc.nextInt();
                    list.deleteAtPosition(position);
                    break;
                case 6:
                    System.out.println("Removing the consecutive duplicates: ");
                    System.out.println("Linked List before removing duplicates: ");
                    list.printLinkedList();
                    System.out.println("Linked List after removing duplicates: ");
                    list.removeConsecutiveDuplicates();
                    list.printLinkedList();
                    break;
                case 7:
                    System.out.println("Reversing the Linked List: ");
                    System.out.println("Linked List before reversal: ");
                    list.printLinkedList();
                    System.out.println("Linked List after reversal: ");
                    list.reverseLinkedList();
                    list.printLinkedList();
                    break;
                case 8:
                    System.out.println("Middle element of Linked List is: ");
                    list.findMidOfLinkedList();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
