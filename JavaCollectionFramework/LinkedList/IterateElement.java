//Write a Java program to iterate through all elements in a linked list.
import java.util.LinkedList;
import java.util.Iterator;
class IterateElement{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(22);
		list.add(35);
		list.add(45);
		list.add(76);
		list.add(87);
		Iterator it = list.iterator();
		System.out.print("LinkedList From Iterator : ");
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}