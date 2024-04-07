//Write a Java program to extract a portion of an array list.
import java.util.ArrayList;
import java.util.Iterator;
class ExtractPortion{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(34);
		al.add(65);
		al.add(45);
		al.add(37);
		al.add(82);
		al.add(27);
		al.add(48);
		Iterator it = al.iterator();
		System.out.print("Your Array List : ");
		while(it.hasNext())
			System.out.print(it.next()+" ");
		System.out.print("\nFrom index 2 to 4 : ");
		for(int i=2;i<5;i++)
			System.out.print(al.get(i)+" ");
	}
}