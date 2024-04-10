//Write a Java program to add elements of a vector to other vector collection at the specified position
import java.util.Vector;
import java.util.Scanner;
class AddCollectionAtPosition{
	public static void main(String[] args){
		Vector<Integer> vc1 = new Vector<>();
		Vector<Integer> vc2 = new Vector<>();
		Scanner sc = new Scanner(System.in);
		vc1.add(33);
		vc1.add(36);
		vc1.add(57);
		vc1.add(78);
		vc1.add(84);
		vc2.add(2);
		vc2.add(3);
		vc2.add(9);
		vc2.add(3);
		vc2.add(8);
		System.out.println("Our 1st Vector : "+vc1);
		System.out.println("Our 1st Vector : "+vc2);
		System.out.print("Enter Index : ");
		int index = sc.nextInt();
		if(index<vc1.size())
			vc1.addAll(index,vc2);
		System.out.println("Updated 1st Vector : "+vc1);
	}
}