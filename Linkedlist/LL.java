class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {
    static Node head;

    public static void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void insertAfter(int key, int data) {
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

    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public static void deleteEnd() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        if (head.next == null) {
            head = null; // Handle the case with a single node.
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public static void deleteStart() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        head = head.next;
    }

    public static boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static int length() {
        int c = 0;
        Node current = head;
        while (current != null) {
            c++;
            current = current.next;
        }
        return c;
    }

    public static void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public static Node reverse(){
        Node next=null;
        Node prev=null;
        Node temp=head;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }

    public static void main(String[] args) {
        insertAtFront(1);
        insertAtFront(2);
        insertAtFront(3);
        insertAtFront(4);
        insertAtFront(5);
        System.out.println("Linked list after inserting at the front:");
        display();

        deleteStart();
        System.out.println("Linked list after deleting at the front:");
        display();

        deleteEnd();
        System.out.println("Linked list after deleting at the end:");
        display();

        System.out.println("Length: " + length());

        insertAfter(3, 4);
        System.out.println("Linked list after inserting after an element:");
        display();

        System.out.println("Search for 2: " + search(2));

        System.out.println("Length: " + length());
        
        head = reverse();
        System.out.println("Linked list after reversing:");
        display();

    }
}
