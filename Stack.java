//implementation of stack using array
class Node { // Node definition
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
public class Stack { // driver class
    static final int SIZE = 10; // size of stack
    static int[] stack = new int[SIZE]; // declare a stack
    static int top = -1; // initial value of top, signifies an empty stack\

    static void push(int data) { // function to insert into the stack
        if(top < SIZE-1)
            stack[++top] = data;
        else
            System.out.println("Stack Overflow");
    }

    static void pop() { // function to delete from stack
        if(top == -1)
            System.out.println("Stack is empty");
        else
            top--;
    }

    static int peek() { // function to get top element from stack
        if(top != -1)
            return stack[top];
        return -1; 
    }

    static boolean empty(){ // function to check if stack is empty
        return top == -1;
    }

    static void display() { // function to print the stack
        for(int i=0; i<=top; i++)
            System.out.print(stack[i]+" ");
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        display();
    }
}

