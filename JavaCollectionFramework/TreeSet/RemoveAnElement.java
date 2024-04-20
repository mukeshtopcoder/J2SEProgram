//Write a Java program to Remove a specified item from the TreeSet collection
import java.util.TreeSet;
import java.util.Scanner;
class RemoveAnElement{
	public static void main(String[] args){
		TreeSet<Integer> ts = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		ts.add(34);
		ts.add(45);
		ts.add(25);
		ts.add(47);
		ts.add(84);
		ts.add(83);
		System.out.println("TreeSet : "+ts);
		System.out.print("Enter Element To Remove : ");
		int num = sc.nextInt();
		ts.remove(num);
		System.out.println("Updated TreeSet : "+ts);
	}
}