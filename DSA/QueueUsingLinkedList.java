class QueueUsingLinkedList{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        next = null;
    }
}

public class Queue{
    static Node front = null;
    static Node rear = null;

    static void insert(int val){
        if(front == null){ // if no elements already present
            front = rear = new Node(val);
        }
        else{
            rear.next = new Node(val);
            rear = rear.next;
        }
    }

    static void delete(){
        if(front == null)
            System.out.println("Queue empty");
        else if(front == rear) // single element left
            front = rear = null;
        else
            front = front.next;
    }

    static boolean empty(){
        return front == null;
    }

    static int peek(){
        return front == null?-1:front.val;
    }

    static void display(){
        Node dummy = front;
        while(dummy != null){
            System.out.println(dummy.val);
            dummy = dummy.next;
        }
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        delete();
        display();
    }
}