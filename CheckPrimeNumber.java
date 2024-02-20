import java.util.Scanner;
class CheckPrimeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int flag = 1;
		for(int i=2;i<=num/2;i++){
			if(num%i==0)
				flag=0;
		}
		if(flag==1)
			System.out.print("Number is Prime");
		else
			System.out.print("Number is Not Prime");
	}
}