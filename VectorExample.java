package sample_package;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
	
		Vector v = new Vector<>();
		v.add("Neha");
		v.add("Mahesh");
		v.addElement(567);
		v.addElement(90.78);
		v.add(4, "AAA");
		System.out.println(v);
		System.out.println(v.capacity());
		Vector v1 = new Vector<>();
		System.out.println(v1.capacity());
		System.out.println(v.elementAt(3));
		System.out.println(v.indexOf("Mahesh"));
		//v.remove(0);
		//v.remove("AAA");
		
		System.out.println(v.size());
		
		ListIterator it = v.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
