//Write a Java program to iterate through all elements in a linked list starting at the specified position.
import java.util.LinkedList;
import java.util.Iterator;
class IterateFromPosition{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(32);
		list.add(43);
		list.add(75);
		list.add(26);
		list.add(48);
		System.out.println("LinkedList : "+list);
		Iterator it = list.listIterator(2);
		System.out.print("Iterate From Position 2 : ");
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}