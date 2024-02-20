// 17 and its reverse 71 is Prime (Emirp)
// 19 and its reverse 91 is Prime (Emrip)
// 23 is prime but not its reverse 32 (Not Emirp)
// 17 and 19 are Emirp or Twisted Prime Number
import java.util.Scanner;
class EmirpNumber{
	public static int Reverse(int num){
		int sum=0;
		for(int i=0;i<num;num=num/10){
			int rem = num%10;
			sum=sum*10+rem;
		}
		return sum;
	}
	public static boolean CheckPrime(int num){
		int flag=1;
		for(int i=2;i<=num/2;i++)
			if(num%i==0)
				flag=0;
		if(flag==1)
			return true;
		else
			return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		if((EmirpNumber.CheckPrime(num))&&(EmirpNumber.CheckPrime(EmirpNumber.Reverse(num))))
			System.out.print("Emirp Number");
		else
			System.out.print("Not Emirp Number");
	}
}