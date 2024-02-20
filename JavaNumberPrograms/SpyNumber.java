// Number 123
// 1+2+3 == 1*2*3  (Spy Number)
// Number 23
// 2+3 != 2*3 (Not Spy Number)
import java.util.Scanner;
class SpyNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int sum=0;
		int mul=1;
		for(int i=0;i<num;num=num/10){
			int rem=num%10;
			sum=sum+rem;
			mul=mul*rem;
		}
		if(sum==mul)
			System.out.print("Spy Number");
		else
			System.out.print("Not Spy Number");
	}
}