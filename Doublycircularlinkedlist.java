package javapractice;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = this.prev = this;
    }
}

class DoublyCircularLinkedList {
    private Node head = null;

     void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node tail = head.prev;
            newNode.next = head;
            newNode.prev = tail;
            tail.next = head.prev = newNode;
            head = newNode;
        }
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node tail = head.prev;
            newNode.next = head;
            newNode.prev = tail;
            tail.next = head.prev = newNode;
        }
    }

    void insertAtPosition(int data, int position) {
        if (position <= 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        for (int i = 1; i < position && current.next != head; i++) {
            current = current.next;
        }

        Node nextNode = current.next;
        newNode.next = nextNode;
        newNode.prev = current;
        current.next = nextNode.prev = newNode;

        if (nextNode == head) {
            head.prev = newNode;
        }
    }

     void deleteFromBeginning() {
        if (head == null) return;

        Node tail = head.prev;
        if (head == tail) {
            head = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    void deleteFromEnd() {
        if (head == null) return;

        Node tail = head.prev;
        if (head == tail) {
            head = null;
        } else {
            Node newTail = tail.prev;
            newTail.next = head;
            head.prev = newTail;
        }
    }

    void deleteFromPosition(int position) {
        if (head == null || position < 0) return;

        Node current = head;
        for (int i = 0; i < position && current.next != head; i++) {
            current = current.next;
        }

        Node prevNode = current.prev;
        Node nextNode = current.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        if (current == head) {
            if (current.next == head) {
                head = null;
            } else {
                head = nextNode;
            }
        }
    }

    void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an operation:");
            System.out.println("1: Insert at beginning");
            System.out.println("2: Insert at end");
            System.out.println("3: Insert at position");
            System.out.println("4: Delete from beginning");
            System.out.println("5: Delete from end");
            System.out.println("6: Delete from position");
            System.out.println("7: Print list");
            System.out.println("0: Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter data to insert at the beginning:");
                    int dataBegin = scanner.nextInt();
                    list.insertAtBeginning(dataBegin);
                    break;
                case 2:
                    System.out.println("Enter data to insert at the end:");
                    int dataEnd = scanner.nextInt();
                    list.insertAtEnd(dataEnd);
                    break;
                case 3:
                    System.out.println("Enter data to insert:");
                    int dataPos = scanner.nextInt();
                    System.out.println("Enter position to insert:");
                    int position = scanner.nextInt();
                    list.insertAtPosition(dataPos, position);
                    break;
                case 4:
                    list.deleteFromBeginning();
                    break;
                case 5:
                    list.deleteFromEnd();
                    break;
                case 6:
                    System.out.println("Enter position to delete:");
                    int delPosition = scanner.nextInt();
                    list.deleteFromPosition(delPosition);
                    break;
                case 7:
                    list.printList();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
