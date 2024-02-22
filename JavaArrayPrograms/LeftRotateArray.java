// Left Rotate to An Array
import java.util.Scanner;
class LeftRotateArray{
	public static int[] Rotate(int[] arr,int n){
		for(int k=1;k<=n;k++){
			int num=arr[0];
			int i;
			for(i=0;i<arr.length-1;i++){
					arr[i]=arr[i+1];
			}
			arr[i]=num;
		}
		return arr;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {23,45,75,78,46,34,64,65};
		System.out.print("Enter Rotation Time : ");
		int times = sc.nextInt();
		System.out.println("Our Array");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		int[] NewArr = LeftRotateArray.Rotate(arr,times);
		System.out.println("\nRotated Array");
		for(int i=0;i<NewArr.length;i++)
			System.out.print(NewArr[i]+" ");
	}
}