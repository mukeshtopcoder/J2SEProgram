//Write a Java program to create an array list, add some colors (strings) and print out the collection.
import java.util.Scanner;
import java.util.ArrayList;
class AddStringAndPrint{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		System.out.print("How Many Strings You Want To Enter : ");
		int range = sc.nextInt();
		for(int i=1;i<=range;i++)
		{
			System.out.print("Enter "+i+" String : ");
			String str = sc.next();
			al.add(str);
		}
		System.out.println("\nYour Strings Are Here");
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
	}
}