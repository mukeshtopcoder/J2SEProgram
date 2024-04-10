//Write a Java program to remove the first occurrence of the specified element from Vector collection
import java.util.Vector;
import java.util.Scanner;
class RemoveFirstOccu{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		Scanner sc = new Scanner(System.in);
		vc.add(23);
		vc.add(45);
		vc.add(46);
		vc.add(34);
		vc.add(46);
		System.out.println("Our Vector : "+vc);
		System.out.print("Enter Any Element : ");
		int num = sc.nextInt();
		for(int i=0;i<vc.size();i++)
			if(num==vc.get(i)){
				vc.remove(i);
				break;
			}
		System.out.print("Updated Vector : "+vc);
	}
}