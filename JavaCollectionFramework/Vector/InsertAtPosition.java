//Write a Java program to insert an item into Vector collection at the specified index
import java.util.Vector;
import java.util.Scanner;
class InsertAtPosition{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		Scanner sc = new Scanner(System.in);
		vc.add(12);
		vc.add(43);
		vc.add(98);
		vc.add(76);
		vc.add(65);
		System.out.println("Our Vector : "+vc);
		System.out.print("Enter Element : ");
		int value = sc.nextInt();
		System.out.print("Enter Position : ");
		int index = sc.nextInt();
		if(index<vc.size())
			vc.add(index,value);
		System.out.println("Update Vector : "+vc);
	}
}