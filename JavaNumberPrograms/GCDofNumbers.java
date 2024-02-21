// GCD/HCF of Two Numbers
import java.util.Scanner;
class GCDofNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();
		int c = a>b?b:a;
		int GCD=1;
		for(int i=1;i<=c;i++){
			if((a%i==0)&&(b%i==0))
				GCD=i;
		}
		System.out.print("GCD is : "+GCD);
	}
}