package SingleLinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.insertNode(1);
//        list.insertNode(2);
//        list.insertNode(3);
//        list.printLinkedList();

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. Insert Into Single Linked List: ");
            System.out.println("2. Length of the Single Linked List: ");
            System.out.println("3. Print the Single Linked List: ");
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
                default:
                    System.exit(0);
            }
        }
    }
}
