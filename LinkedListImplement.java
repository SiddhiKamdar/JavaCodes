import java.util.Scanner;

class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class LinkedList {
    Node head;

    void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.link = head;
        head = newNode;
    }

    void display() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.link;
        }
        System.out.println();
    }

    void deleteFirstNode() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        head = head.link;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.link != null) {
            currentNode = currentNode.link;
        }
        currentNode.link = newNode;
    }

    void deleteLastNode() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        if (head.link == null) {
            head = null;
            return;
        }
        Node currentNode = head;
        while (currentNode.link.link != null) {
            currentNode = currentNode.link;
        }
        currentNode.link = null;
    }

    void deleteNodeFromPosition(int position) {
        if (head == null) {
            System.out.println("Linked list is already empty.");
            return;
        }
        if (position == 1) {
            head = head.link;
            return;
        }
        Node currentNode = head;
        int count = 1;
        while (currentNode != null && count < position - 1) {
            currentNode = currentNode.link;
            count++;
        }
        if (currentNode == null || currentNode.link == null) {
            System.out.println("Invalid position.");
            return;
        }
        currentNode.link = currentNode.link.link;
    }
}

public class LinkedListImplement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        int choice, data, position;

        
            System.out.println("Menu:");
            System.out.println("1. Insert a node at the front");
            System.out.println("2. Display all nodes");
            System.out.println("3. Delete the first node");
            System.out.println("4. Insert a node at the end");
            System.out.println("5. Delete the last node");
            System.out.println("6. Delete a node from specified position");
            System.out.println("0. Exit");
        do {    
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data to insert: ");
                    data = scanner.nextInt();
                    linkedList.insertAtFront(data);
                    break;
                case 2:
                    linkedList.display();
                    break;
                case 3:
                    linkedList.deleteFirstNode();
                    break;
                case 4:
                    System.out.print("Enter the data to insert: ");
                    data = scanner.nextInt();
                    linkedList.insertAtEnd(data);
                    break;
                case 5:
                    linkedList.deleteLastNode();
                    break;
                case 6:
                    System.out.print("Enter the position of the node to delete: ");
                    position = scanner.nextInt();
                    linkedList.deleteNodeFromPosition(position);
                    break;
                case 7:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        } while (choice != 7);

        scanner.close();
    }
}
