//Write a Java program to check whether an item exists in a TreeSet collection or not
import java.util.TreeSet;
import java.util.Scanner;
class ExistElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(23);
		ts.add(56);
		ts.add(26);
		ts.add(64);
		ts.add(16);
		ts.add(82);
		ts.add(36);
		System.out.println("TreeSet : "+ts);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		System.out.println("Element Exist : "+ts.contains(num));
	}
}