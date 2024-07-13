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
                default:
                    System.exit(0);
            }
        }
    }
}
