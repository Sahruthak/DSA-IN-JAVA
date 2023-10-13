class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;;
    }
}
public class Main
{
    static Node head=null;
    static Node top=null;
    public static void push(int val){
        if(head==null){
            head=new Node(val);
            top=head;
            return;
        }
        Node vals=new Node(val);
        top.next=vals;
        top=top.next;

    }
    public static void pop(){
        if(head==null){
            System.out.print("Underflow");
            return;
        }
        if(head==top){
            head=null;
            top=null;
            return;
        }
        
        Node temp=head; //create a copy head
        while(temp.next!=top){
            temp=temp.next;
        }
        temp.next=null; //delete top element
        top=temp;
    }
    public static int peek(){
        if(head==null) return -1;
        
        return top.val;
    }
    public static boolean isempty(){
        return head==null;
    }
    public static void display(){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
	public static void main(String[] args) {
		push(12);
	    push(14);
	    push(13);
	    push(11);
	    push(15);
	    pop();
	    System.out.println(peek());
	    System.out.println(isempty());
	    display();
	}
}
