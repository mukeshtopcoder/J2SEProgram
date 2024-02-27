// 222 = 2*3*37  , 646 = 2*17*19
// Number Build By 3 Distinct Prime Number Multiply
import java.util.Scanner;
class SphenicNumber{
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
		int newNum=1;
		int count=0;
		for(int i=2;i<=num/2;i++)
			if(num%i==0)
				if(SphenicNumber.CheckPrime(i)){
				newNum=newNum*i;
				count++;
				if(count==3)
					break;
				}
		if(num==newNum)
			System.out.print("Sphenic Number");
		else
			System.out.print("Not Sphenic Number");
	}
}