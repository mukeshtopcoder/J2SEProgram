//Write a Java program to remove and return the first element of a linked list.
import java.util.LinkedList;
class RemoveAndReturnFirstElement{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(23);
		list.add(75);
		list.add(54);
		list.add(53);
		list.add(87);
		System.out.println("Our LinkedList : "+list);
		System.out.println("Our First Element : "+list.get(0));
		list.removeFirst();
		System.out.println("Update LinkedList : "+list);
	}
}