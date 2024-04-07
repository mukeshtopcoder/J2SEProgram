//Write a Java program to update an array element by the given element.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
class UpdateAnElement{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		al.add("Java");
		al.add("Python");
		al.add("React");
		al.add("C++");
		al.add("JavaScript");
		Iterator it = al.iterator();
		System.out.println("\nYour Strings Are Here");
		while(it.hasNext())
			System.out.println(it.next());
		System.out.print("Enter Language To Update on Position 2 to Change React : ");
		String str = sc.next();
		al.set(2,str);
		it = al.iterator();
		System.out.println("\nYour Strings Are Here");
		while(it.hasNext())
			System.out.println(it.next());
	}
}