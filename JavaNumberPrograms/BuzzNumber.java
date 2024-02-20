// A Number which is divisible by 7 or ends with 7
import java.util.Scanner;
class BuzzNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		if((num%10==7)||(num%7==0))
			System.out.print("Buzz Number");
		else
			System.out.print("Not Buzz Number");
	}
}