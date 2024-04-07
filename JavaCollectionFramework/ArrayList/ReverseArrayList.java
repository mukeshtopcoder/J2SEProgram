//Write a Java program to reverse elements in an array list.
import java.util.ArrayList;
import java.util.Iterator;
class ReverseArrayList{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(23);
		al.add(34);
		al.add(56);
		al.add(26);
		al.add(35);
		al.add(21);
		al.add(28);
		Iterator it = al.iterator();
		System.out.print("Your Array List : ");
		while(it.hasNext())
			System.out.print(it.next()+" ");
		int m=0;
		for(int i=al.size()-1;i>=al.size()/2;i--)
		{
			int temp = al.get(i);
			al.set(i,al.get(m));
			al.set(m,temp);
			m=m+1;
		}
		it = al.iterator();
		System.out.print("\nYour Reversed Array List : ");
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}