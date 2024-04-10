//Write a Java program to replace a specified element at all places with another element in Vector collection
import java.util.Vector;
import java.util.Scanner;
class ReplaceAtAllPlaces{
	public static void main(String[] args)
	{
		Vector<Integer> vc = new Vector<>();
		Scanner sc = new Scanner(System.in);
		vc.add(12);
		vc.add(45);
		vc.add(76);
		vc.add(34);
		vc.add(45);
		vc.add(57);
		vc.add(24);
		System.out.println("Our Vector : "+vc);
		System.out.print("Enter Element To Delete : ");
		int num = sc.nextInt();
		for(int i=0;i<vc.size();i++)
			if(num==vc.get(i)){
				Integer n = vc.get(i);
				vc.remove(n);
			}
		System.out.println("Our Vector : "+vc);	
	}
}