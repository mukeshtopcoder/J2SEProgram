//Write a Java program to get the elements greater than and equal to the specified item from TreeSet Collection
import java.util.TreeSet;
import java.util.Scanner;
class EqualToOrGreater{
	public static void main(String[] args){
		TreeSet<Integer> ts = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		ts.add(44);
		ts.add(67);
		ts.add(72);
		ts.add(45);
		ts.add(25);
		ts.add(78);
		System.out.println("TreeSet : "+ts);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		System.out.println("Greater Or Equal To Value : "+ts.ceiling(num));
	}
}