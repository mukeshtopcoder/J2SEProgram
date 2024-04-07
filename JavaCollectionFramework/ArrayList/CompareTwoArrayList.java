//Write a Java program to compare two array lists.
import java.util.ArrayList;
import java.util.Iterator;
class CompareTwoArrayList{
	public static void main(String[] args)
	{
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		al1.add(34);
		al1.add(54);
		al1.add(54);
		al1.add(45);
		al1.add(77);
		al1.add(47);
		al2.add(77);
		al2.add(56);
		al2.add(37);
		al2.add(45);
		al2.add(72);
		al2.add(27);
		al2.add(71);
		Iterator it1 = al1.iterator();
		Iterator it2 = al2.iterator();
		System.out.print("\nOur 1st Array List : ");
		while(it1.hasNext())
			System.out.print(it1.next()+" ");
		System.out.print("\nOur 2nd Array List : ");
		while(it2.hasNext())
			System.out.print(it2.next()+" ");
		System.out.print("\nLength of 1st Array : "+al1.size());
		System.out.print("\nLength of 2nd Array : "+al2.size());
		int count=0;
		for(int i=0;i<al1.size();i++)
		{
			for(int j=0;j<al2.size();j++)
			{
				if(al1.get(i)==al2.get(j))
				{
					count++;
					break;
				}
			}
		}
		System.out.print("\nTotal Matched Items : "+count);
	}
}