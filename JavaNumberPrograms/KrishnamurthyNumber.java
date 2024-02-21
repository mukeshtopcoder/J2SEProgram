// Number : 145
// If 1^3+4^3+5^3 = 145 So, It is a Krishnamurthy
import java.util.Scanner;
class KrishnamurthyNumber{
	public static int Fact(int no){
		int fact=1;
		for(int i=1;i<=no;i++)
			fact=fact*i;
		return fact;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int copy = num;
		int sum=0;
		for(int j=0;j<num;num=num/10)
		  sum=sum+KrishnamurthyNumber.Fact(num%10);
		if(sum==copy)
			System.out.print("Krishnamurthy");
		else
			System.out.print("Not Krishnamurthy");
	}
}	