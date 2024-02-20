// Number : 9 Square of 9 is 81
// 8+1=9 which is equal to Number it is Neon
// Number : 45 Square of 45 is 2025
// 2+0+2+5=9 which is not equal to Number, Not Neon
import java.util.Scanner;
class NeonNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int square = num*num;
		int copy=num;
		int sum = 0;
		for(int i=0;i<copy;copy=copy/10){
			int rem = copy%10;
			sum = sum+rem;
		}
		if(sum==num)
			System.out.print("Neon Number");
		else
			System.out.print("Not Neon Number");
	}
}