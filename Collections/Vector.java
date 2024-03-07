import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Vector al=new Vector();
	    al.addElement("sah");
	    al.addElement("reddy");
	    al.addElement(1);
		System.out.println(al);
		al.removeElement(1);
		System.out.println(al);
		Enumeration it=al.elements();
		while(it.hasMoreElements()){
		    System.out.println(it.nextElement());
		}
	}
}
