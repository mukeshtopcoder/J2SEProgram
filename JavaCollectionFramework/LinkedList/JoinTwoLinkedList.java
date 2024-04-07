//Write a Java program to join two linked lists.
import java.util.LinkedList;
class JoinTwoLinkedList{
	public static void main(String[] args)
	{
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(23);
		list1.add(53);
		list1.add(32);
		list1.add(45);
		list1.add(15);
		list2.add(32);
		list2.add(54);
		list2.add(76);
		list2.add(74);
		list2.add(84);
		System.out.println("Our First LinkedList : "+list1);
		System.out.println("Our First LinkedList : "+list2);
		list1.addAll(list2);
		System.out.println("After Join Both LinkedList Into First LinkedList\nOur First LinkedList : "+list1);
	}
}