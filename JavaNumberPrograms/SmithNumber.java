// Number : 666 => 666 = 2*3*3*37
// 2+3+3+3+7 = 6+6+6 = 18 so, 666 is Smith
import java.util.Scanner;
class SmithNumber{
	public static int Sum(int n){
		int sum=0;
		for(int i=0;i<n;n=n/10)
			sum=sum+n%10;
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int temp = num;
		int i=2;
		int j=0;
		int[] arr = new int[10];
		while(i<=num){
			if(num%i==0){
				arr[j]=i;
				num=num/i;
				i=2;
				j++;
			}else
				i++;
		}
		int sum=0;
		for(i=0;i<j;i++){
			sum=sum+SmithNumber.Sum(arr[i]);
		}
		if(sum==SmithNumber.Sum(temp))
			System.out.print("Smith Number");
		else
			System.out.print("Not Smith Number");
	}
}	