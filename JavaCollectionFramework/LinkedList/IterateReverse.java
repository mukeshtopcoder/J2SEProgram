//Write a Java program to iterate a linked list in reverse order.
import java.util.LinkedList;
import java.util.Iterator;
class IterateReverse{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(23);
		list.add(78);
		list.add(45);
		list.add(67);
		list.add(34);
		System.out.println("Our LinkedList : "+list);
		Iterator it = list.descendingIterator();
		System.out.print("Reverse LinkedList : ");
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}