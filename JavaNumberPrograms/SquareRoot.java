// Square Root
import java.util.Scanner;
class SquareRoot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int flag=0;
		for(int i=1;i<=num/2;i++)
			if(i*i==num){
				flag=1;
				System.out.print("SqRt : "+i);
				break;
			}
		if(flag==0)
			System.out.print("No SqRt Found!");
	}
}