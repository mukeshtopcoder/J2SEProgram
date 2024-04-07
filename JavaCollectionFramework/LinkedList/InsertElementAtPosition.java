//Write a Java program to insert the specified element at the specified position in the linked list.
import java.util.LinkedList;
import java.util.Scanner;
class InsertElementAtPosition{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		list.add(12);
		list.add(23);
		list.add(46);
		list.add(67);
		list.add(35);
		list.add(24);
		System.out.println("Our LinkedList : "+list);
		System.out.print("Enter Element : ");
		int num = sc.nextInt();
		System.out.print("Enter Index : ");
		int index = sc.nextInt();
		if(index<list.size())
			list.add(index,num);
		System.out.println("Updated LinkedList : "+list);
	}
}