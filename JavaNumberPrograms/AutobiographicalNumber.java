import java.util.Scanner;
class AutobiographicalNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		for(int i=0;i<temp;temp=temp/10)
			count++;
		temp=num;
		int[] arrNum = new int[count];
		for(int i=count-1;i>=0;i--){
			arrNum[i]=temp%10;
			temp=temp/10;
		}
		int flag=1;
		for(int i=0;i<count;i++){
			int c=0;
			for(int j=0;j<count;j++){
				if(i==arrNum[j])
					c++;
			}
			if(c!=arrNum[i])
				flag=0;
		}
		if(flag==1)
			System.out.print("Autobiographical Number");
		else
			System.out.print("Not Autobiographical Number");
	}
}