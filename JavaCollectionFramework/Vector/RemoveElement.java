//Write a Java program to remove a specified item from Vector collection
import java.util.Scanner;
import java.util.Vector;
class RemoveElement{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		Scanner sc = new Scanner(System.in);
		vc.add(12);
		vc.add(43);
		vc.add(98);
		vc.add(76);
		vc.add(65);
		System.out.println("Our Vector : "+vc);
		System.out.print("Enter Element To Delete : ");
		Integer num = sc.nextInt();
		vc.remove(num);
		System.out.println("Removed Element Vector : "+vc);
	}
}