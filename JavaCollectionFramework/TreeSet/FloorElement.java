//Write a Java program to get the flooring item of specified value from TreeSet collection.
import java.util.TreeSet;
import java.util.Scanner;
class FloorElement{
	public static void main(String[] args){
		TreeSet<Integer> ts = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		ts.add(23);
		ts.add(45);
		ts.add(78);
		ts.add(36);
		ts.add(65);
		ts.add(83);
		ts.add(15);
		System.out.println("TreeSet : "+ts);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		System.out.print("Floor Item : "+ts.floor(num));
	}
}