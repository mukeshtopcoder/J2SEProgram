// Number : 19 (By Adding both 2 digits)
// 1 9 10 19 found Number in its own Fibonacci Series
// Number : 197 (By Adding Among 3 digits)
// 1 9 7 17 33 57 107 197 (Found)
import java.util.Scanner;
class KeithNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int Temp = num;
		int Temp2 = num;
		int count=0;
		for(int i=0;i<Temp;Temp=Temp/10)
			count++;
		int[] arr = new int[count];
		for(int i=count-1;i>=0;i--){
			arr[i]=Temp2%10;
			Temp2 = Temp2/10;
		}
		int sum=0;
		int flag = 0;
		while(sum<num){
			sum=0;
			for(int i=0;i<count;i++)
				sum=sum+arr[i];
			int j;
			for(j=0;j<count-1;j++)
				arr[j]=arr[j+1];
			arr[j]=sum;
			if(sum==num)
				flag=1;
		}
		if(flag==1)
			System.out.print("Keith Number");
		else
			System.out.print("Not Keith Number");
	}
}