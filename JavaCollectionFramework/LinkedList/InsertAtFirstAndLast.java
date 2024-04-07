//Write a Java program to insert elements into the linked list at the first and last positions.
import java.util.LinkedList;
import java.util.Scanner;
class InsertAtFirstAndLast{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		list.add(12);
		list.add(56);
		list.add(23);
		list.add(67);
		list.add(23);
		System.out.println("Our LinkedList : "+list);
		System.out.print("Enter Element At First Position : ");
		int first = sc.nextInt();
		System.out.print("Enter Element At Last Position : ");
		int last = sc.nextInt();
		list.addFirst(first);
		list.addLast(last);
		System.out.print("Updated LinkedList : "+list);
	}
}