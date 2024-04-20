//Write a Java program to Check whether a HashSet contains a specified item or not
import java.util.Scanner;
import java.util.HashSet;
class CheckItemContain{
	public static void main(String[] args){
		HashSet<Integer> hs = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		hs.add(34);
		hs.add(35);
		hs.add(46);
		hs.add(56);
		hs.add(26);
		hs.add(48);
		hs.add(46);
		System.out.println("HashSet : "+hs);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		if(hs.contains(num))
			System.out.println("Number Exists in HashSet!");
		else
			System.out.println("Number Doesn't Exists!");
	}
}