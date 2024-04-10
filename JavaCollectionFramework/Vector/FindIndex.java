//Write a Java program to get the Index of the first occurrence of the specified item in Vector collection
import java.util.Vector;
import java.util.Scanner;
class FindIndex{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		Scanner sc = new Scanner(System.in);
		vc.add(23);
		vc.add(45);
		vc.add(46);
		vc.add(72);
		vc.add(35);
		System.out.println("Our Vector : "+vc);
		System.out.print("Enter Any Element : ");
		int num = sc.nextInt();
		int flag=-1;
		for(int i=0;i<vc.size();i++)
			if(num==vc.get(i))
			{
				flag=i;
				break;
			}
		if(flag!=-1)
			System.out.println("Element Index is : "+flag);
		else
			System.out.println("Element Not Found");
	}
}