//Write a Java program to remove an item from Vector collection at the specified index
import java.util.Scanner;
import java.util.Vector;
class RemoveItemFromIndex{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		Scanner sc = new Scanner(System.in);
		vc.add(33);
		vc.add(36);
		vc.add(57);
		vc.add(78);
		vc.add(84);
		System.out.println("Our Vector : "+vc);
		System.out.print("Enter Index To Remove Element : ");
		int index = sc.nextInt();
		if(index<vc.size())
			vc.remove(index);
		System.out.println("Our Vector : "+vc);
	}
}