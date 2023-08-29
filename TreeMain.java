import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

class TreeImplementation {
    Node root;

    void insert(int num) {
        Node newNode = new Node(num);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        while (true) {
            if (newNode.data < current.data) {
                if (current.left == null) {
                    current.left = newNode;
                    return;
                } else {
                    current = current.left;
                }
            } else if (newNode.data > current.data) {
                if (current.right == null) {
                    current.right = newNode;
                    return;
                } else {
                    current = current.right;
                }
            } else {
                return;
            }
        }
    }

    void delete(int value) {
        Node current = root;
        Node previous = null;
        boolean isLeft = false;

        while (current != null && current.data != value) {
            if (current.data > value) {
                previous = current;
                current = current.left;
                isLeft = true;
            } else if (current.data < value) {
                previous = current;
                current = current.right;
                isLeft = false;
            }
        }
        if (current == null) {
            System.out.println("Node not found");
            return;
        }
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeft) {
                previous.left = null;
            } else {
                previous.right = null;
            }
            return;
        }
        if (current.right != null) {
            if (current == root) {
                root = current.right;
            } else {
                if (isLeft) {
                    previous.left = current.right;
                } else {
                    previous.right = current.right;
                }
            }
            return;
        }

        if (current.left != null) {
            if (current == root) {
                root = current.left;
            } else {
                if (isLeft) {
                    previous.left = current.left;
                } else {
                    previous.right = current.left;
                }
            }
            return;
        }

        Node max = current.left;
        Node maxPrev = null;
        if (max.right == null) {
            current.data = max.data;
            current.left = null;
            return;
        }
        while (max.right != null) {
            maxPrev = max;
            max = max.right;
        }
        current.data = max.data;
        maxPrev.right = null;
    }

    void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print(root.data + " ");
            display(root.right);
        }
    }
}

public class TreeMain {
    public static void main(String[] args) {
        TreeImplementation tree = new TreeImplementation();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number to insert: ");
                    int num = scanner.nextInt();
                    tree.insert(num);
                    break;
                case 2:
                    System.out.print("Enter the number to delete: ");
                    int value = scanner.nextInt();
                    tree.delete(value);
                    break;
                case 3:
                    System.out.print("Tree: ");
                    tree.display(tree.root);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
