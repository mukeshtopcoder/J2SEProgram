// Number : 121
// 121 = 29 + (92)Reverse Of 21 = 121 Mystry Number
// Number : 22
// 22 = 11 + (11)Reverse Of 11 = 22 Mystry Number
import java.util.Scanner;
class MystryNumber{
	public static int Reverse(int numm){
		int sum=0;
		for(int i=0;i<numm;numm=numm/10)
			sum=sum*10+(numm%10);
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int flag=0;
		for(int i=1;i<=num;i++)
			if((i+MystryNumber.Reverse(i))==num){
				System.out.println(i+"+"+MystryNumber.Reverse(i)+"="+num);
				flag=1;
				break;
			}
		if(flag==1)
			System.out.print("Mystry Number");
		else
			System.out.print("Not Mystry Number");
	}
}