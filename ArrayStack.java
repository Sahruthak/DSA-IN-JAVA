import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val,Node next){
        val=this.val;
        next=this.next;
    }
}
 
public class ArrayStack
{
    static int size=100;
    static int[] st=new int[size];
    static int top=-1;
    public static void push(int val){
        if(top<size-1){
            st[++top]=val;
        } 
        else{
            System.out.println("FULL");
        }
    }
    public static void pop(){
        if(top>-1){
            top--;
        } 
        else{
            System.out.println("Empty");
        }
    }
    public static int peek(){
        if(top!=-1){
            return st[top];
        } 
        return -1;
    }
    public static boolean isempty(){
        return top==-1;
    }
    public static void display(){
        for(int i=0;i<=top;i++){
            System.out.print(st[i]+" ");
        }
    }
	public static void main(String[] args) {
	    push(13);
	    push(23);
	    push(33);
	    pop();
	    push(10);
	    System.out.println("TOP "+peek());
	    System.out.println("Elements ");
		display();
	}
}
