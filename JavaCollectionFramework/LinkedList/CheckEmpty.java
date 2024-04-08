//Write a Java program to check if a linked list is empty or not.
import java.util.LinkedList;
class CheckEmpty{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(23);
		list.add(45);
		list.add(62);
		list.add(46);
		System.out.println("Our LinkedList : "+list);
		System.out.println("After Clear LinkedList");
		list.clear();
		System.out.println("Our LinkedList : "+list);
		System.out.print("Is LinkedList Empty? : "+list.isEmpty());
	}
}