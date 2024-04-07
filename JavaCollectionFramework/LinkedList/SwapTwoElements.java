//Write a Java program that swaps two elements in a linked list.
import java.util.LinkedList;
class SwapTwoElements{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(23);
		list.add(56);
		list.add(96);
		list.add(28);
		list.add(63);
		list.add(52);
		System.out.println("Our LinkedList : "+list);
		int temp = list.get(1);
		list.set(1,list.get(2));
		list.set(2,temp);
		System.out.println("2nd And 3rd Elements Swapped");
		System.out.print("Updated LinkedList : "+list);
	}
}