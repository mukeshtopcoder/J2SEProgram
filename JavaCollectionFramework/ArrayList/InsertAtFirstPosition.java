//Write a Java program to insert an element into the array list at the first position.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class InsertAtFirstPosition{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		al.add("India");
		al.add("Hello");
		al.add("World");
		al.add("Hello");
		al.add("Mumbai");
		Iterator<String> it = al.iterator();
		System.out.println("All Elements of ArrayList");
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("\nEnter String For First Position : ");
		String str = sc.next();
		al.add(0,str);
		it = al.iterator();
		System.out.println("\nAll Elements of ArrayList");
		while(it.hasNext())
			System.out.println(it.next());
	}
}