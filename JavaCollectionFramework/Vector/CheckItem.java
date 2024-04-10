//Write a Java program to check whether a Vector collection contains a specified item or not
import java.util.Vector;
import java.util.Scanner;
class CheckItem{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		Scanner sc = new Scanner(System.in);
		vc.add(23);
		vc.add(78);
		vc.add(64);
		vc.add(73);
		vc.add(74);
		System.out.println("Our Vector : "+vc);
		System.out.print("Enter Element : ");
		int num = sc.nextInt();
		if(vc.contains(num))
			System.out.print("Item Available");
		else
			System.out.print("Item is Not Available");
	}
}