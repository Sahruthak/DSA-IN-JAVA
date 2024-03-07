import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    LinkedList al=new LinkedList();
	    al.add("sah");
	    al.add("reddy");
	    al.add(1);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext()){
		    System.out.println(it.next());
		}
	}
}
