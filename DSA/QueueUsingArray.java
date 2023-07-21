public class QueueUsingArray{
    static final int SIZE = 5;
    static int[] array = new int[SIZE];
    static int front = -1;
    static int rear = -1;

    static void insert(int val){
        if(front == -1){
            front = rear = 0;
            array[front] = val;
        }
        else if(front == (rear+1)%SIZE){ // queue full
            System.out.println("Queue full");
        }
        else{
            array[(rear+1)%SIZE] = val;
            rear = (rear+1)%SIZE;
        }
    }

    static void delete(){
        if(front == -1)
            System.out.println("Queue empty");
        else if(front == rear){ // single element left
            array[front] = -1; // or null
            front = rear = -1;
        }   
        else{
            array[front] = -1;
            front = (front+1)%SIZE;
        }   
    }

    static boolean empty(){
        return front == -1;
    }

    static int peek(){
        return front == -1?-1:array[front];
    }

    static void display(){
        if(front == -1)
            System.out.println("Queue Empty");
        else{
            for(int i=front; i<=rear; i=(i+1)%SIZE)
                System.out.print(array[i]+" ");
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