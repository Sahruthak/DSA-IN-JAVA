class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert a node after a specific element
    public void insertAfter(int key, int data) {
        Node newNode = new Node(data);
        Node current = head;
        boolean found = false;

        while (current != null) {
            if (current.data == key) {
                newNode.next = current.next;
                current.next = newNode;
                found = true;
                break;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("Element " + key + " not found in the linked list.");
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtFront(3); 
        list.insertAtFront(2); 
        list.insertAtFront(1); 

        System.out.println("Linked list after inserting at the front:");
        list.display();

        list.insertAfter(2, 4); 

        System.out.println("Linked list after inserting after an element:");
        list.display();
    }
}
