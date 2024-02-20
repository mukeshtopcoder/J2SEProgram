// A Number 'N' is a sunny number if 'N+1' is a perfect Square
import java.util.Scanner;
class SunnyNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int flag = 0;
		for(int i=1;i<=num/2;i++){
			if(i*i==(num+1))
				flag=1;
		}
		if(flag==1)
			System.out.print("Sunny Number");
		else
			System.out.print("Not Sunny Number");
	}
}