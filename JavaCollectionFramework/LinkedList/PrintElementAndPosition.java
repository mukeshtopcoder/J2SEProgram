//Write a Java program to display elements and their positions in a linked list.
import java.util.LinkedList;
class PrintElementAndPosition{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(12);
		list.add(34);
		list.add(38);
		list.add(28);
		list.add(76);
		System.out.println("Our LinkedList Elements");
		for(int i=0;i<list.size();i++)
			System.out.println("Position : "+i+" => Value : "+list.get(i));
	}
}