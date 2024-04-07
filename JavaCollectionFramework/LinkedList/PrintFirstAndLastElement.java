//Write a Java program to get the first and last occurrence of the specified elements in a linked list.
import java.util.LinkedList;
class PrintFirstAndLastElement{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(23);
		list.add(79);
		list.add(46);
		list.add(38);
		list.add(83);
		list.add(56);
		System.out.println("Our LinkedList : "+list);
		System.out.println("First Element : "+list.getFirst());
		System.out.print("Last Element : "+list.getLast());
	}
}