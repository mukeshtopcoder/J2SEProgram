//Write a Java program to iterate through all elements in an array list.
import java.util.ArrayList;
import java.util.Iterator;	
class IterateElements{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		al.add("Five");
		Iterator<String> it = al.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}