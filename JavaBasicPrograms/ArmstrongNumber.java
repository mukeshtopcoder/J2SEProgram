// Armstrong Number 153 : 1^3+5^3+3^3 = 153 Armstrong
import java.util.Scanner;
class ArmstrongNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int CopyNum = num;
		int sum = 0;
		for(int i=0;i<num;num=num/10){
			int rem = num%10;
			sum = sum+rem*rem*rem;
		}
		if(sum==CopyNum)
			System.out.print("Armstrong Number");
		else
			System.out.print("Not Armstrong Number");
	}
}