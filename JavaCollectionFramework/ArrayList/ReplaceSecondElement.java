//Write a Java program to replace the second element of an ArrayList with the specified element.
import java.util.ArrayList;
import java.util.Scanner;
class ReplaceSecondElement{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		al.add(32);
		al.add(43);
		al.add(24);
		al.add(45);
		al.add(67);
		System.out.print("ArrayList : "+al);
		al.set(1,99);
		System.out.print("\nSecond Element is Replaced : "+al);
	}
}