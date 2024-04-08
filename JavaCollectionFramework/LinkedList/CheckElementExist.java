//Write a Java program to check if a particular element exists in a linked list.
import java.util.LinkedList;
import java.util.Scanner;
class CheckElementExist{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		list.add(62);
		list.add(74);
		list.add(35);
		list.add(76);
		list.add(73);
		list.add(16);
		list.add(25);
		System.out.println("Our LinkedList : "+list);
		System.out.print("Enter Number To Find : ");
		int num = sc.nextInt();
		System.out.println("Number Exist : "+list.contains(num));
	}
}