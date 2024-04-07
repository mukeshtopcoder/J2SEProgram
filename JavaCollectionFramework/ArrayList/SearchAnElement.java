//Write a Java program to search for an element in an array list.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
class SearchAnElement{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		al.add("Python");
		al.add("JavaScript");
		al.add("Java");
		al.add("DotNet");
		al.add("Csharp");
		System.out.println("Your Strings Are Here");
		Iterator it = al.iterator();
		while(it.hasNext())
			System.out.print(it.next()+"  ");
		System.out.print("\nEnter String To Be Searched : ");
		String str = sc.next();
		int flag=0;
		for(int i=0;i<al.size();i++)
			if(al.get(i).equals(str))
			{
				flag=1;
				System.out.print("Found On Position on : "+i);
				break;
			}
		if(flag==0)
			System.out.print("Not Found!");
	}
}